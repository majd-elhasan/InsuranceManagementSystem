package account;

import mainPackage.User;

public class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    String addPolicy() {
        return null;
    }
}
