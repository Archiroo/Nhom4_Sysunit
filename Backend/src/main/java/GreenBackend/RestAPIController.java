package GreenBackend;

import GreenBackend.Unit.IUnitService;
import GreenBackend.auth.jwt.JWTAuthenticalServiceImpl;
import com.google.gson.Gson;
import com.greentrade.common.base.BaseResponse;
import com.greentrade.common.base.Cred;
import com.greentrade.common.base.GTException;
import com.greentrade.common.domain.sys.SysBranch;
import com.greentrade.common.domain.sys.SysUnit;
import com.greentrade.common.utils.ExceptionType;
import com.greentrade.common.utils.LoggingUtil;
import org.apache.tomcat.util.http.parser.Authorization;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apinhom4")
public class RestAPIController {

    @Autowired
    private JWTAuthenticalServiceImpl jwtAuthenticalService;

    @Autowired
    private IUnitService unitService; // thay đổi interface

    private static Logger logger = LoggingUtil.createLogger(RestAPIController.class);
    @RequestMapping(value = "/unit/get", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse getList(@RequestBody SysUnit body) throws Exception{
        BaseResponse response = new BaseResponse();

        StringBuilder sb = new StringBuilder();
        String errCode = "";
        String userId = "";

        long begin = System.currentTimeMillis();
            // get tất cả các bản ghi của table Unit
            List<SysUnit> results = unitService.getList(body);
//            String data = Utils.toJson(results);
            response.setData(results);

            // Đến đây là thành công
            response.setResultCode(0);

        return response;
    }

    //INSERT
    @RequestMapping(value = "/sysunit/insert", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse insertSysUnit(@RequestBody SysUnit body) throws Exception {
        BaseResponse response = new BaseResponse();

        StringBuilder sb = new StringBuilder();
        String errCode = "";
        String userId = "";

        long begin = System.currentTimeMillis();
        unitService.insert(body);
        response.setResultCode(0);
        return response;
    }

    //Update
    @RequestMapping(value = "/sysunit/update", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse updateSysUnit(@RequestBody SysUnit body) throws Exception {
        BaseResponse response = new BaseResponse();
        StringBuilder sb = new StringBuilder();
        String errCode = "";
        String userId = "";
        long begin = System.currentTimeMillis();

        unitService.update(body);
        response.setResultCode(0);
        return response;
    }

    //Delete
    @RequestMapping(value = "/sysunit/delete", method = RequestMethod.POST, produces = "application/json")
    public BaseResponse deleteSysUnit(@RequestBody SysUnit body) throws Exception {
        BaseResponse response = new BaseResponse();
        StringBuilder sb = new StringBuilder();
        String errCode = "";
        String userId = "";
        long begin = System.currentTimeMillis();

        unitService.delete(body);
        response.setResultCode(0);
        return response;
    }

    //getByCustCd




}
