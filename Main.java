/*
While app is running:
Data_signal = getSignalStrength()
Wifi = getWifiStrength()
Battery = getBatteryLevel()
Motion = getMotionState()
If Data_signal < 2  and wifi > 3
suggest(“Switch to Wi-Fi”)
Else if motion == “moving” and signal < 3:
	reduceDataUsage()
Else if battery < 20;
enablePowerSaver()
Else: 
	maintainNormal();
wait(10 secs)
end

Pseudo Code to reference when writing
 */
class Main{  
    // int location;
    // Not sure what data type location vars should be...
    int signalStrength;
    int batteryLevel;
    int wifiStrength;
    String context;
    String motionState;

    public int getSignalStrength(String[] args){
    // 0 - 4 scale, The signal bars essentially.
      return signalStrength;
    }

    public int getWifiStrength(String[] args){
        // RSSI level
        return wifiStrength;
    }
  
    public int getBatteryLevel(String[] args){
      // 0 -100%
      return batteryLevel;
    }

    public String getMotionState(String[] args){
      // gets state either walking running or vehicl
     return motionState;
    }

    public static int getLocation(String[] args){
      // gets gps coords
      int location;

      return location;
    }
    public static void applyChanges(String[] args){
    
    
    }
    public String analzyeContext(String[] args){

      return context;
    }
    public void logData(String[] args, wifiStrength, Context, signalStrength, motionState, batteryLevel,) {
        // this method will log info
    }
  
  public static void main(String[] args) {


    }
}