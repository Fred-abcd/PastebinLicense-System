
# Java Pastebin License-Key Checker

A Java library for license key validation. The license key is retrieved from a Raw Pastebin URL and compared against the license key provided by the user.
## Usage/Examples

The library is provided as a JAR file. You can include it in your project and use the `LicenseChecker` class to check the license key.

**Constructor**: 
```java
public LicenseChecker(String pastebinRawUrl, String licenseKey)
```

Creates a new LicenseChecker that searches for the license key in the specified Raw Pastebin URL and compares it with the licenseKey provided by the user.

- `pastebinRawUrl` - The Raw Pastebin URL that contains the license key.
- `licenseKey` - The license key provided by the user.

**Method**:
```java
public boolean checkLicenseKey() throws IOException
```
Checks whether the license key provided by the user is contained in the content of the specified Raw Pastebin URL.

## Example

Here's an example that shows how you can use the library in your Java code:

```java
import java.io.IOException;

public class MyProgram {
    public static void main(String[] args) {
        LicenseChecker checker = new LicenseChecker("https://pastebin.com/raw/PASTE_ID", "LICENSE_KEY");
        try {
            if (checker.checkLicenseKey()) {
                System.out.println("License key is valid.");
            } else {
                System.out.println("Invalid license key.");
            }
        } catch (IOException e) {
            System.out.println("Error checking license key: " + e.getMessage());
        }
    }
}
```
In this example, a `LicenseChecker` is instantiated with the Raw Pastebin URL and license key, and the `checkLicenseKey` method is called. If the license key is valid, a message is printed saying that the license key is valid. Otherwise, a message is printed saying that the license key is invalid.
## License
This library is licensed under the [MIT](https://choosealicense.com/licenses/mit/)
 License.
