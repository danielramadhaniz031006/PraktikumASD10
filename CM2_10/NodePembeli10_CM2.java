package CM2_10;

public class NodePembeli10_CM2 {

    int noAntrian;
    Pembeli10_CM2 data;

    NodePembeli10_CM2 prev;
    NodePembeli10_CM2 next;

    public NodePembeli10_CM2(
            NodePembeli10_CM2 prev,
            int noAntrian,
            Pembeli10_CM2 data,
            NodePembeli10_CM2 next) {

        this.prev = prev;
        this.noAntrian = noAntrian;
        this.data = data;
        this.next = next;
    }
}