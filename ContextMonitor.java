
// This is the main file that runs everything..

public class ContextMonitor {

  // instances for every sensor..
  SignalSensor signalSensor = new SignalSensor();
  WifiSensor wifiSensor = new WifiSensor();
  BatterySensor batterySensor = new BatterySensor();
  MotionSensor motionSensor = new MotionSensor();
  
  // should fetch the data from each of the sensors..
  int signal = SignalSensor.getSignalStrength();
  int wifi = WifiSensor.getWifiStrength();
  int battery = BatterySensor.getBatteryLevel();
  String motion = motionSensor.getMotionState();
  
  // model for context (what to do)

  ContextData context = new ContextData(signal, wifi, battery, motion);

  // pass to decision maker
  String decision = decision.anaylze(context);

  
}
