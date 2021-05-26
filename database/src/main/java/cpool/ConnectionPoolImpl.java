//package cpool;
//
//import java.sql.Connection;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class ConnectionPoolImpl implements ConnectionPool {
//
//    /**
//     * 空闲连接池
//     */
//    private LinkedBlockingQueue<Connection> idleConnectPool;
//
//    /**
//     * 活跃连接池
//     */
//    private LinkedBlockingQueue<Connection> busyConnectPool;
//
//    /**
//     * 当前正在被使用的连接数
//     */
//    private AtomicInteger activeSize = new AtomicInteger(0);
//
//    /**
//     * 最大连接数
//     */
//    private final int maxSize;
//
//    public ConnectionPoolImpl(int maxSize) {
//        this.maxSize = maxSize;
//        init();  //init pool
//    }
//
//
//    @Override
//    public void init() {
//        idleConnectPool = new LinkedBlockingQueue<>();
//        busyConnectPool = new LinkedBlockingQueue<>();
//
//    }
//
//    @Override
//    public Connection getConnection() {
//        //从idle池中取出一个连接
//        Connection connection=idleConnectPool.poll();
//        if (connection!=null){
//            //如果有连接，则放入busy池中
//            busyConnectPool.offer(connection);
//            System.out.println("获取到连接");
//            return connection;
//        }
//        return null;
//    }
//
//
//    /**
//     *释放一个连接
//     */
//    @Override
//    public void releaswConnection(Connection connection) {
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
