package pe.com.practicaguevara.practicaguevara02;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Alumno on 5/04/2018.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder>{

    private List<Restaurant> restaurant;

    public void setRestaurant(List<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView fullnameText;
        TextView descripcionText;

        public ViewHolder(View itemView) {
            super(itemView);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            descripcionText = itemView.findViewById(R.id.descripcion_text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Restaurant person = restaurant.get(position);

        holder.fullnameText.setText(person.getFullname());
        holder.descripcionText.setText(person.getDescripcion());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(holder.itemView.getContext(), "Detalles de Persona: " + person.getFullname(), Toast.LENGTH_SHORT).show();
                // Llamar a otra pantalla y mostrar sus detalles de esta persona ...

            }
        });

    }

    @Override
    public int getItemCount() {
        return restaurant.size();
    }

}