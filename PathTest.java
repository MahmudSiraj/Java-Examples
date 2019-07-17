import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Set;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * PathTest
 */
public class PathTest {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/Users/Siraj/Java tutorial/xanadu.txt");
        Path newFile = Paths.get("/Users/Siraj/Java tutorial/xanadu1.txt");
        //Path target = Paths.get(first, more)
        PosixFileAttributes attrs = Files.readAttributes(newFile, PosixFileAttributes.class);

        // long currentTime = System.currentTimeMillis();
        // FileTime ft = FileTime.fromMillis(currentTime);
        // Files.setLastModifiedTime(path, ft);

        // System.out.println("creationTime: " + attr.creationTime());
        // System.out.println("lastAccessTime: " + attr.lastAccessTime());
        // System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
        
        // System.out.println("isDirectory: " + attr.isDirectory());
        // System.out.println("isOther: " + attr.isOther());
        // System.out.println("isRegularFile: " + attr.isRegularFile());
        // System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        // System.out.println("size: " + attr.size());
    
        System.out.format("%s %s %s%n",
        attrs.owner().getName(),
        attrs.group().getName(),
        PosixFilePermissions.toString(attrs.permissions()));

        // FileAttribute<Set<PosixFilePermission>> attr = 
        //     PosixFilePermissions.asFileAttribute(attrs.permissions());
        // Files.createFile(newFile, attr);
    
    }
}