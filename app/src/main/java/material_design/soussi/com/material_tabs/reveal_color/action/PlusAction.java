package material_design.soussi.com.material_tabs.reveal_color.action;

/**
 * Created by Soussi on 12/01/2015.
 */
public class PlusAction extends Action {

    public PlusAction() {

        final float bottom = 76f / 96f;
        final float top = 1f - bottom;
        final float left = 20f / 96f;
        final float right = 1f - left;
        final float center = 0.5f;

        lineData = new float[]{
                // line 1
                center, top, center, bottom,
                // line 2
                left, center, right, center,
                // line 3
                center, top, center, bottom,};
    }
}