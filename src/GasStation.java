public class GasStation {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        System.out.println(gasStation.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, tCapacity = 0, cCapacity = 0, sIndex = 0;
        for (int i = 0; i < n; i++) {
            int cTankCap = gas[i] - cost[i];
            tCapacity += cTankCap;
            cCapacity += cTankCap;

            if (cCapacity < 0) {
                sIndex = i + 1;
                cCapacity = 0;
            }
        }
        return tCapacity >= 0 ? sIndex : -1;
    }
}
