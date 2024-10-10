package Java9;

public class ProcessApi {
    public static void main(String[] args) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
        Process process = processBuilder.start();

        // Get process information
        ProcessHandle processHandle = process.toHandle();
        System.out.println("Process ID: " + processHandle.pid());
        System.out.println("Is Alive: " + processHandle.isAlive());

        // Wait for the process to terminate
        processHandle.onExit().thenRun(() -> System.out.println("Process terminated"));
    }
}
