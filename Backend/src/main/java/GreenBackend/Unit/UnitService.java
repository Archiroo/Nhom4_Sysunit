package GreenBackend.Unit;

import GreenBackend.global.Utils;
import com.greentrade.common.base.Cred;
import com.greentrade.common.domain.sys.SysUnit;
import com.greentrade.common.utils.CompareUtil;
import com.greentrade.common.utils.DateTimeUtil;
import org.springframework.dao.*;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class UnitService implements IUnitService{

    private JdbcTemplate jdbcTemplate;

    public UnitService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void insert(SysUnit sysUnit) throws Exception {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.jdbcTemplate);
        simpleJdbcCall.withProcedureName("SysUnitInsert_Nhom4"); // thủ tục insert unit
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("UnitCode", sysUnit.getUnitCode());
        params.addValue("BranchCode", sysUnit.getBranchCode());
        params.addValue("UnitName", sysUnit.getUnitName());
        params.addValue("UnitSName", sysUnit.getUnitSName());
        params.addValue("Address", sysUnit.getAddress());
        params.addValue("TelNo", sysUnit.getTelNo());
        params.addValue("FaxNo", sysUnit.getFaxNo());
        params.addValue("Email", sysUnit.getEmail());
        params.addValue("Type", sysUnit.getType());
        params.addValue("Status", sysUnit.getStatus());
        params.addValue("Remarks", sysUnit.getRemarks());

            simpleJdbcCall.execute(params);
            // Viet ham chung dung GenericType

    }

    @Override
    public void update(SysUnit sysUnit) throws Exception {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.jdbcTemplate);
        simpleJdbcCall.withProcedureName("SysUnitUpdate_Nhom4");
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("UnitCode", sysUnit.getUnitCode());
        params.addValue("BranchCode", sysUnit.getBranchCode());
        params.addValue("UnitName", sysUnit.getUnitName());
        params.addValue("UnitSName", sysUnit.getUnitSName());
        params.addValue("Address", sysUnit.getAddress());
        params.addValue("TelNo", sysUnit.getTelNo());
        params.addValue("FaxNo", sysUnit.getFaxNo());
        params.addValue("Email", sysUnit.getEmail());
        params.addValue("Type", sysUnit.getType());
        params.addValue("Status", sysUnit.getStatus());
        params.addValue("Remarks", sysUnit.getRemarks());
        params.addValue("UpdatedTime", DateTimeUtil.toSqlDate(sysUnit.getUpdatedTime()));

        simpleJdbcCall.execute(params);
    }

    @Override
    public void delete(SysUnit sysUnit) throws Exception {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.jdbcTemplate);
        simpleJdbcCall.withProcedureName("SysUnitDelete_Nhom4");
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("UnitCode", sysUnit.getUnitCode());
        params.addValue("UpdatedTime", DateTimeUtil.toSqlDate(sysUnit.getUpdatedTime()));

        simpleJdbcCall.execute(params);
    }



    @Override
    public List<SysUnit> getList(SysUnit sysUnit) throws Exception {
        List<SysUnit> resultsData = new ArrayList<>();
            SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.jdbcTemplate);
            simpleJdbcCall.withProcedureName("SysUnitGetList_Nhom4") // sửa tên proceduce
                    .returningResultSet("SysUnit", BeanPropertyRowMapper.newInstance(SysUnit.class));
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("UnitCode", sysUnit.getUnitCode() == null? "" : sysUnit.getUnitCode() );
            params.addValue("BranchCode", sysUnit.getBranchCode() == null? "" : sysUnit.getBranchCode());
            params.addValue("UnitName", sysUnit.getUnitName() == null? "" : sysUnit.getUnitName());
            params.addValue("Address", sysUnit.getAddress() == null? "" : sysUnit.getAddress());
            params.addValue("Type", sysUnit.getType() == null? 0 : sysUnit.getType());
            params.addValue("Status", sysUnit.getStatus() == null? 0 : sysUnit.getStatus());

            Map<String, Object> out = simpleJdbcCall.execute(params);

            List<SysUnit> sysUnits = (List<SysUnit>) out.get("SysUnit");
            if (!CompareUtil.isEqualsNull(sysUnits) && sysUnits.size() > 0) {
                resultsData = sysUnits;
            }


        return resultsData;
    }
}
