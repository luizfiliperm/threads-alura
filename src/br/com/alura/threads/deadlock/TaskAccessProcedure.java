package br.com.alura.threads.deadlock;

public class TaskAccessProcedure implements Runnable {
    private ConnectionPool pool;
    private TransactionManager tx;

    public TaskAccessProcedure(ConnectionPool pool, TransactionManager tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (pool) {
            System.out.println("Getting connection from the pool");
            pool.getConnection();
            synchronized (tx) {
                System.out.println("Starting transaction");
                tx.begin();

            }
        }
    }
}
