package hw.ch05;

public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance;
    private StringBuilder logBuffer;

    private LoggerSynchronizedLazy() {
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    // getInstance 호출 시 동기화 처리하여 인스턴스 생성 [cite: 152]
    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (instance == null) {
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
                 .append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}