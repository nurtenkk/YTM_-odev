package mobilya_mağazası;

public class ClassicShowroom extends showroom{
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
}
