package transport;

import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public Queue<Transport> getQueue() {
        return queue;
    }

    public void addTransportToQueue(Transport transport) {
        if (transport.isNeedDiagnostic(transport)) {
            queue.offer(transport);
            System.out.println(transport + " in line for diagnostics");
        } else {
            System.out.println(transport + " don't pas diagnostics");
        }
    }

    public void passTheDiagnostic() {
        Transport transport;
        while ((transport = queue.poll()) !=null) {
            System.out.println(transport + " has been diagnosed");
        }
    }
}
