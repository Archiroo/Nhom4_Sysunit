package GreenBackend.Unit;

import com.greentrade.common.base.Cred;
import com.greentrade.common.domain.sys.SysUnit;

import javax.swing.*;
import java.util.List;

public interface IUnitService {
    void insert(SysUnit obj) throws Exception;

    void update(SysUnit obj) throws Exception;

    void delete(SysUnit obj) throws Exception;

    List<SysUnit> getList(SysUnit obj) throws Exception;
}
