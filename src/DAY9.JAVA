/*
public class Day9{

    // Login
    sealed interface LoginResult
            permits LoginSuccess, LoginFailure, LoginLoading {
    }

    record LoginSuccess(String username) implements LoginResult {
    }

    record LoginFailure(String reason) implements LoginResult {
    }

    record LoginLoading(String message) implements LoginResult {
    }

    static void handleLogin(LoginResult result) {
        switch (result) {
            case LoginSuccess success ->
                    System.out.println("Login Successful : " + success.username());

            case LoginFailure failure ->
                    System.out.println("Login Failed because of " + failure.reason());

            case LoginLoading loading ->
                    System.out.println("Login Loading... " + loading.message());
        }
    }

    public static void main(String[] args) {

        LoginResult loginSuccess =
                new LoginSuccess("John");

        LoginResult loginFailure =
                new LoginFailure("Invalid Password");

        LoginResult loginLoading =
                new LoginLoading("Please wait...");

        handleLogin(loginSuccess);
        handleLogin(loginFailure);
        handleLogin(loginLoading);
    }
}

 */
/*
public class DAY9 {
    static class college implements AutoCloseable {
        college() {
            System.out.println("college");
        }

        @Override
        public void close() throws Exception {
            System.out.println(" college Close");
        }
    }

    static class department extends college {
        department() {
            System.out.println("department");
        }

        @Override
        public void close() throws Exception {
            System.out.println("department Close");
            super.close();
        }
    }

    static class section extends department {
        section() {
            System.out.println("section");
        }

        @Override
        public void close() throws Exception {
            System.out.println("section Close");
            super.close();
        }
    }

    static void main() throws Exception {
        section section;
      try(section Section = new section() ){
        }
    }
}

*/


