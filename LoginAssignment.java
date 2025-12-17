class LoginAssignment 
{
    private String username;
    private String password;
    // Setter for username
    public void setUsername(String username)
    {
        this.username = username;
    }
    // Setter for password with validation
    public void setPassword(String password) 
    {
        if (password.length() >= 8)
        {
            this.password = password;
            System.out.println("Password accepted");
        } 
        else 
        {
            System.out.println("Password must be at least 8 characters");
        }
    }
    // Getter methods
    public String getUsername() 
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public static void main(String[] args) 
    {
        LoginAssignment l = new LoginAssignment();
        l.setUsername("admin");
        l.setPassword("admin123");
    }
}