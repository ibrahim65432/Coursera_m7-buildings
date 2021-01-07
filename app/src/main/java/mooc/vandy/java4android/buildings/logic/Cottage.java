package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
    private boolean mSecondFloor = false;

    public Cottage(int dimensions, int logLength, int lotWidth){
        super((int) Math.sqrt(dimensions), (int) Math.sqrt(dimensions),logLength, lotWidth);

    }

    public Cottage(int dimensions, int mLotLength, int mLotWidth,  String mOwner, boolean mSecondFloor) {
        super((int) Math.sqrt(dimensions), (int) Math.sqrt(dimensions), mLotLength, mLotWidth, mOwner);
        this.mSecondFloor = mSecondFloor;
    }

    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if(!mSecondFloor){
            stringBuilder.append("; is a cottage");
        }
        else{
            stringBuilder.append("; is a two story cottage");
        }
        return stringBuilder.toString();
    }
    // TODO - Put your code here.

    
}

