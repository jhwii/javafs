package a0712.p_575;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent(){
        return new Home();
    }
}
