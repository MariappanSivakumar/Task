
public class FileTranferUsingPrority {

    public void FileTranfer(String filename) {
        java.io.FileInputStream OriginalFile = null;
        java.io.FileOutputStream DuplicateFile = null;
        try {
            OriginalFile = new java.io.FileInputStream(
                    "E:/jdk1.3/bin/"+filename);
            java.io.File f = new java.io.File("C:/Users/useja/Desktop/FileTranfer/"+filename);
            System.out.println(f.length());
            DuplicateFile = new java.io.FileOutputStream(f);

            int c;

            while ((c = OriginalFile.read()) != -1) {
                DuplicateFile.write(c);
            }
            //System.out.println(filename+" ---> Tranfered Succussfully");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (java.io.IOException e) {}
    }
    public void StepByStepFileTranferProcess()
    {
       java.util.Map<Long,String> FileandSizeStore = new java.util.HashMap();
        java.util.PriorityQueue<Long> numberWiseSort = new java.util.PriorityQueue<Long>();

        java.io.File directoryPath = new java.io.File("E:/jdk1.3/bin/");
        java.io.File filesList[] = directoryPath.listFiles();

        for (java.io.File file : filesList) {
            numberWiseSort.add(file.length());
            FileandSizeStore.put(file.length(),file.getName());
        }
        while(numberWiseSort.size()!=0)
        {
            FileTranfer(FileandSizeStore.get(numberWiseSort.poll()));
        } 
        System.out.println(FileandSizeStore);
    }
    public static void main(String ar[]) {
        new FileTranferUsingPrority().StepByStepFileTranferProcess();
    }
}
