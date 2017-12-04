package ros.msgs.geometry_msgs;
import ros.msgs.std_msgs.Header;
import ros.msgs.geometry_msgs.Point;

/**
 * A Java Bean for the Vector3 ROS geometry_msgs/Vector3 message type. This can be used both for publishing Vector3 messages to
 * {@link ros.RosBridge} and unpacking Vector3 messages received from {@link ros.RosBridge} (see the {@link ros.tools.MessageUnpacker}
 * documentation for how to easily unpack a ROS Bridge message into a Java object).
 * @author James MacGlashan.
 */
public class PointStamped {
    public Header header;
	public Point point;
    

	public PointStamped(Header h, Point p) {
		this.header = h;
		this.point = p;
	}
}
