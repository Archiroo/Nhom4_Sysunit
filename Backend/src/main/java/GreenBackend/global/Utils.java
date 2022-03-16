package GreenBackend.global;

import com.greentrade.common.base.Cred;
import com.greentrade.common.base.GTException;
import com.greentrade.common.domain.sys.SysMenu;
import com.greentrade.common.domain.sys.SysRole;
import com.greentrade.common.utils.ExceptionType;
import org.springframework.dao.*;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.util.Arrays;
import java.util.List;

@Component
public class Utils {

    public static boolean checkRole(List<SysRole> roleList, String roleCd) throws GTException {
        return checkRole(roleList, roleCd, true);
    }

    public static boolean checkRole(List<SysRole> roleList, String roleCd, boolean isThrowEx) throws GTException {

        boolean hasRole = false;
        for (int i = 0; i < roleList.size(); i++) {
            if (roleList.get(i).getRoleCode().toLowerCase().compareTo(roleCd.toLowerCase()) == 0) {
                hasRole = true;
                break;
            }
        }
        if (!hasRole) {
            if(isThrowEx) {
                throw new GTException("E99997", "Bạn không có quyền thực hiện chức năng");
            }
        }

        return  hasRole;
    }

    public static boolean checkMenu(List<SysMenu> menuList, String menuCd) throws GTException {
        return checkMenu(menuList, menuCd, true);
    }

    public static boolean checkMenu(List<SysMenu> menuList, String menuCd, boolean isThrowEx) throws GTException {

        boolean hasMenu = false;
        for (int i = 0; i < menuList.size(); i++) {
            if (menuList.get(i).getMenuCode().toLowerCase().compareTo(menuCd.toLowerCase()) == 0) {
                hasMenu = true;
                break;
            }
        }
        if (!hasMenu) {
            if(isThrowEx) {
                throw new GTException("E99998","Bạn không có quyền thực hiện menu");
            }
        }

        return  hasMenu;
    }

    public static String getQueryProcedure(String name, int params) {
        StringBuilder result = new StringBuilder("{call " + name + "(");
        for (int i = 0; i < params - 1; i++) {
            result.append("?,");
        }
        if (params > 0) {
            result.append("?");
        }
        result.append(")}");
        return result.toString();
    }

    public static GTException processException(DataIntegrityViolationException ex, Cred cred) {
        String [] message = null;
        if (ex.getMessage() != null) {
            message = ex.getCause().getMessage().split(";");
        } else {
            message = new String[]{ExceptionType.E100_003};
        }
        return getException(message, cred);
    }

    public static GTException processException(UncategorizedSQLException ex, Cred cred) {
        String [] message = null;
        if (ex.getMessage() != null) {
            message = ex.getCause().getMessage().split(";");
        } else {
            message = new String[]{ExceptionType.E100_003};
        }
        return getException(message, cred);
    }

    public static GTException processException(DataRetrievalFailureException ex, Cred cred) {
        String [] message = null;
        if (ex.getMessage() != null) {
            message = ex.getCause().getMessage().split(";");
        } else {
            message = new String[]{ExceptionType.E100_003};
        }
        return getException(message, cred);
    }
    public static GTException processException(DeadlockLoserDataAccessException ex, Cred cred) {
        String [] message = null;
        if (ex.getMessage() != null) {
            message = ex.getCause().getMessage().split(";");
        } else {
            message = new String[]{ExceptionType.E100_003};
        }
        return getException(message, cred);
    }
    public static GTException processException(InvalidDataAccessResourceUsageException ex, Cred cred) {
        String [] message = null;
        if (ex.getMessage() != null) {
            message = ex.getCause().getMessage().split(";");
        } else {
            message = new String[]{ExceptionType.E100_003};
        }
        return getException(message, cred);
    }
    public static GTException processException(DataAccessResourceFailureException ex, Cred cred) {
        String [] message = null;
        if (ex.getMessage() != null) {
            message = ex.getCause().getMessage().split(";");
        } else {
            message = new String[]{ExceptionType.E100_003};
        }
        return getException(message, cred);
    }
    private static GTException getException(String [] message, Cred cred) {
        String code = message[0];
        String [] params = Arrays.copyOfRange(message, 1, message.length);
        return new GTException(cred.getLanguage(), code, null, params);
    }

    public static String[] processUserAgent(String userAgent) {
        String [] results = new String[3];
        results[0] = ""; // device
        results[1] = ""; // browser
        results[2] = ""; // operator
        if (userAgent == null) {
            return results;
        }
        if(userAgent.contains("Mobi")) {
            results[0] = "Mobile";
        } else {
            results[0] = "Web";
        }

        if (userAgent.contains("Firefox"))
        {
            results[1] = "Firefox";
        } else if (userAgent.contains("Chrome"))
        {
            results[1] = "Chrome";
        } else if (userAgent.contains("Safari"))
        {
            results[1] = "Safari";
        } else {
            results[1] = "Other";
        }

        int start = userAgent.indexOf("(");
        int end = userAgent.indexOf(")");
        if (start >= 0 && end > start) {
            String operator = userAgent.substring(start + 1, end);
            results[2] = operator;
        }
        return results;
    }
}
