package GreenBackend.service;

import com.greentrade.common.base.Cred;
import com.greentrade.common.domain.User;
import com.greentrade.common.domain.sys.*;

import java.util.List;

public interface IRedisService {

    void openBusinessDate(String branchCode) throws Exception;
    void closeBusinessDate(String branchCode) throws Exception;
    void closeHistBusinessDate(String branchCode) throws Exception;
    String getBusinessDateStatus(String branchCode) throws Exception;
    String getBusinessDateStatusCustomer(String branchCode) throws Exception;

    void setValue(String key, String value) throws Exception;
    void setValueCustomer(String key, String value) throws Exception;

    String getValue(String key) throws Exception;
    String getValueCustomer(String key) throws Exception;

    void deleteValue(String key) throws Exception;
    void deleteValueCustomer(String key) throws Exception;

    Boolean hasKey(String key) throws Exception;
    Boolean hasKeyCustomer(String key) throws Exception;

    void deleteAllToken(String userId) throws Exception;
    void deleteAllTokenCustomer(String userId) throws Exception;

    void deleteAllToken() throws Exception;
    void deleteAllTokenCustomer() throws Exception;

    List<Cred> getCustomerActive() throws Exception;
}
