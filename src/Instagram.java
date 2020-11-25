public class Instagram extends website implements SocialWebPage {

    @Override
    public void Register(String FirstName, String LastName, int NumberPhone, boolean Gender) {

    }

    @Override
    public boolean Login(int NumberPhone, String gmail) {
        return false;
    }

    @Override
    public boolean SearchField(String Users) {
        return false;
    }

    @Override
    public String[] PicturesList() {
        return new String[0];
    }

    @Override
    public void connect(String PicturesList, String FriendList) {

    }
}
