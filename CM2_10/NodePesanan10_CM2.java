package CM2_10;

public class NodePesanan10_CM2 {

    Pesanan10_CM2 data;

    NodePesanan10_CM2 prev;
    NodePesanan10_CM2 next;

    public NodePesanan10_CM2(
            NodePesanan10_CM2 prev,
            Pesanan10_CM2 data,
            NodePesanan10_CM2 next) {

        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}