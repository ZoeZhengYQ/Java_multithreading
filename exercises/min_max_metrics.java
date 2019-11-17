
/**
 * Ex 3 - Min-Max Metrics
 * 
 * A single instance of this class will be passed to multiple threads in 
 * the application.
 * MinMaxMetrics is an analytics class and is used to keep track of 
 * the minimum and the maximum of a particular business or performance metric in our applicaton.
 */

public class MinMaxMetrics {
    
    // Add all necessary member variables
    private volatile long minVal; // volatile to make read atomic
    private volatile long maxVal;

    /**
     * Initializes all member variables
     */
    public MinMaxMetrics() {
        // Add code here
        this.minVal = Long.MAX_VALUE;
        this.maxVal = Long.MIN_VALUE;
    }

    /**
     * Adds a new sample to our metrics.
     */
    public synchronized void addSample(long newSample) {
        // Add code here
        if (newSample > this.maxVal) {
            this.maxVal = newSample;
            return;
        } 
        if (newSample < this.minVal) {
            this.minVal = newSample;
            return;
        }
    }

    /**
     * Returns the smallest sample we've seen so far.
     */
    public long getMin() {
        // Add code here
        return this.minVal;
    }

    /**
     * Returns the biggest sample we've seen so far.
     */
    public long getMax() {
        // Add code here
        return this.maxVal;
    }
}
