import java.util.concurrent.ArrayBlockingQueue;


public class BlockingBuffer implements Buffer {
    private final ArrayBlockingQueue<Integer> buffer;

    public BlockingBuffer(int bufferSize){
        buffer = new ArrayBlockingQueue<>(bufferSize);
    }
    @Override
    public void blockingPut(final int value) throws InterruptedException {
        buffer.put(value); // place value in buffer
        System.out.printf("%s%2d\t%s%d%n", "Producer writes ", value, "Buffer cells occupied: ", buffer.size());

    }

    @Override
    public int blockingGet() throws InterruptedException {
        final int readValue = buffer.take(); // remove value from buffer
        System.out.printf("%s %2d\t%s%d%n", "Consumer reads: ", readValue, "Buffer cells occupied: ", buffer.size());
        return readValue;
    }
    
}