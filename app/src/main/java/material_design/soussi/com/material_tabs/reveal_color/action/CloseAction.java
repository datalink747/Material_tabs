package material_design.soussi.com.material_tabs.reveal_color.action;

/**
 * Created by Soussi on 12/01/2015.
 */
public class CloseAction extends Action {

    public CloseAction() {
        final float start = 0.239375f;
        final float end = 1f - start;

        lineData = new float[]{
                // line 1
                start, start, end, end,
                // line 2
                start, end, end, start,
                // line 3
                start, start, end, end,};
    }
}
