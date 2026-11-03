package mobilya_mağazası;

public class ModernShowroom extends showroom{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
