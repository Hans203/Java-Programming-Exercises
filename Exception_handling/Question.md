# AI-driven Traffic Monitoring System

With the implementation of AI-driven traffic monitoring systems in major Indian cities like Bengaluru, Delhi, and Mumbai, automated e-challan systems are being used to detect and penalize traffic violations. These AI-powered systems identify offenses such as overspeeding (above 60 km/h), jumping a red light, and detecting unauthorized vehicles (vehicles without proper registration plates). You have been tasked with developing a Java-based prototype that simulates this system.

1. Implement a Vehicle class that stores the vehicle number and speed.

2. Write a method checkTrafficViolation() that does the following:
   - If speed exceeds 60 km/h, throw a TrafficViolationException for overspeeding.
   - If a vehicle jumps a red light, throw a TrafficViolationException with an appropriate message.
   - If a vehicle has no number plate, throw an UnauthorizedVehicleException (a custom exception).

3. Use exception handling (throw, throws, try-catch, and finally) to ensure that:
   - Violations are detected properly.
   - UnauthorizedVehicleException is handled separately.
   - The system logs every traffic check, regardless of whether a violation occurred (finally).

### **Sample output**

| Vehicle Number | Speed (km/h) | Red Light Jump | Expected Output |
|---------------|-------------|--------------|----------------|
| KA53MB7297 | 60 km/h | No | No Violation |
| KA04ZX5678 | 100 km/h | No | Challan Issued: Overspeeding |
| MH20ZZ9876 | 50 km/h | Yes | Challan Issued: Red Light Jump |
| (No Number Plate) | 70 km/h | No | UnauthorizedVehicleException: Potential S |