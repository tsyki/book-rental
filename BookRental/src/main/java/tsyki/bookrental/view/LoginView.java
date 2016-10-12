package tsyki.bookrental.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * ログイン画面用バッキングビーン
 * @author TOSHIYUKI.IMAIZUMI
 * @since 2016/10/12
 */
@Named
@RequestScoped
public class LoginView {
    @NotEmpty
    @Size( min = 4, max = 8)
    private String userCode;

    @NotEmpty
    private String password;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode( String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password) {
        this.password = password;
    }

    public String login() {
        if ( userCode.equals( "admin") && password.equals( "admin")) {
            System.out.println( "login success");
        }
        else {
            System.out.println( "login failed");
        }
        return null;
    }

    public String logout() {
        return null;
    }
}
