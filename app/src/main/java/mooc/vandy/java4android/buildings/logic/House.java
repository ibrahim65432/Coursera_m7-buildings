package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    private String mOwner = "n/a";
    private boolean mPool = false;

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        super(mLength, mWidth, mLotLength, mLotWidth);
    }

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth, String mOwner) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mOwner = mOwner;
    }

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth, String mOwner, boolean mPool) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mOwner = mOwner;
        this.mPool = mPool;
    }

    public String getOwner() {
        return mOwner;
    }

    public boolean hasPool(){
        return mPool;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mOwner);
        if(mPool){
            stringBuilder.append("; has a pool");
        }
        if(calcLotArea()-calcBuildingArea() > calcBuildingArea()){
            stringBuilder.append("; has a big open space");
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object o){
        if(((House) o).calcBuildingArea()==this.calcBuildingArea() && ((House) o).mPool==this.mPool){
            return true;
        }
        return false;
    }

    // TODO - Put your code here.
    
}
