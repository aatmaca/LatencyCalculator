package latency;

public class Packet {

	int source;
	int destination;
	int packetSize;

	public Packet(int s, int d, int size) {
		source = s;
		destination = d;
		packetSize = size;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public int getPacketSize() {
		return packetSize;
	}

	public void setPacketSize(int packetSize) {
		this.packetSize = packetSize;
	}

}
