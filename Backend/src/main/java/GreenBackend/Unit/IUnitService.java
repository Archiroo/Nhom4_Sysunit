package GreenBackend.Unit;

import com.greentrade.common.base.Cred;
import com.greentrade.common.domain.sys.SysUnit;

import javax.swing.*;
import java.util.List;

public interface IUnitService {
//  Insert
    void insert(SysUnit obj) throws Exception;
//  Update
    void update(SysUnit obj) throws Exception;
//  Delete
    void delete(SysUnit obj) throws Exception;
//  GetList
    List<SysUnit> getList(SysUnit obj) throws Exception;
}
