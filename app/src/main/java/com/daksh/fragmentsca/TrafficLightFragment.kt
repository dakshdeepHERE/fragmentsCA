import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.daksh.fragmentsca.R

class TrafficLightFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.traffic_light_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.redButton).setOnClickListener {
            showMessage("The traffic light is red")
        }

        view.findViewById<Button>(R.id.yellowButton).setOnClickListener {
            showMessage("The traffic light is yellow")
        }

        view.findViewById<Button>(R.id.greenButton).setOnClickListener {
            showMessage("The traffic light is green")
        }
    }

    private fun showMessage(message: String) {
        val fragment = MessageFragment.newInstance(message)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}
