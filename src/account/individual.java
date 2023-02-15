package account;

import mainPackage.User;

public class individual extends Account {
    public individual(User user) {
        super(user);
    }

    @Override
    String addPolicy() {
        return null;
    }
}
