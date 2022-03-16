package GreenBackend.global;

import com.greentrade.common.base.Cred;
import com.greentrade.common.domain.sys.SysBranch;
import com.greentrade.common.utils.CmnEnums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
public class GlobalData {
    public static Date businessDate = new Date();
}
