public interface SocialWebPage {
    public void Register(String FirstName, String LastName, int NumberPhone,boolean Gender);
    public boolean Login(int NumberPhone,String gmail);
    public boolean SearchField(String Users);
    public String[] PicturesList();
    public void connect (String PicturesList, String FriendList);

}
