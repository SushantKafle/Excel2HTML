import org.apache.poi.ss.usermodel.CellStyle;

import java.util.Formatter;

public interface HtmlHelper {
    /**
     * Outputs the appropriate CSS style for the given cell style.
     *
     * @param style The cell style.
     * @param out   The place to write the output.
     */
    void colorStyles(CellStyle style, Formatter out);
}