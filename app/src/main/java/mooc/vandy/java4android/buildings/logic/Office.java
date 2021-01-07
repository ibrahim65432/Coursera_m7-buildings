package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
    private String mBusinessName = null;
    private int mParkingSpaces = 0;
    private static int sTotalOffices = 0;

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        sTotalOffices++;
    }

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth, String mBusinessName) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mBusinessName = mBusinessName;
        sTotalOffices++;

    }

    public Office(int mLength, int mWidth, int mLotLength, int mLotWidth, String mBusinessName, int mParkingSpaces) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mBusinessName = mBusinessName;
        this.mParkingSpaces = mParkingSpaces;
        sTotalOffices++;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public static int getTotalOffices() {
        return sTotalOffices;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        if(mBusinessName==null){
            stringBuilder.append("unoccupied");
        }
        else{
            stringBuilder.append(mBusinessName);
        }

        if(getParkingSpaces()>0){
            stringBuilder.append("; has ").append(getParkingSpaces()).append(" parking spaces");
        }

        stringBuilder.append(" (total offices: ").append(sTotalOffices).append(")");

        return stringBuilder.toString();
    }
    @Override
    public boolean equals(Object o){
        if(((Office) o).calcBuildingArea()==this.calcBuildingArea() && ((Office) o).getParkingSpaces() ==
        this.mParkingSpaces){
            return true;
        }
        return false;
    }

    // TODO - Put your code here.
    
}
