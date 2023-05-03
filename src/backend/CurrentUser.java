package backend;

public enum CurrentUser {
    currentUser;
    
    private User user;
    
    public User getCurrentUser() {
        if(user == null)
            return null;
        else
            return user;
    }
    
    public void setCurrentUser(User user) {
        this.user = user;
    }
}
