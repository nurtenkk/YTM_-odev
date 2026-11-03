package mobilya_mağazası;

public class ClassicFactory implements FurnitureFactory

{
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
