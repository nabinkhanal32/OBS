package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.obs.DetailsActivity;
import com.obs.R;
import model.dashboard;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class dashboardAdapter extends RecyclerView.Adapter<dashboardAdapter.ContactsViewHolder> {
    Context mdashboard;
    List<dashboard> dashboardList;

    public dashboardAdapter(Context mdashboard, List<dashboard> dashboardList) {
        this.mdashboard = mdashboard;
        this.dashboardList = dashboardList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dashboard, viewGroup
                , false);
        return new ContactsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder dashboardViewHolder, int i) {
        final dashboard dashboard = dashboardList.get(i);
        dashboardViewHolder.imgProfile.setImageResource(dashboard.getImgId());
        dashboardViewHolder.tvName.setText(dashboard.getName());
        dashboardViewHolder.tvPhone.setText(dashboard.getPhoneNo());

        dashboardViewHolder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(mdashboard, DetailsActivity.class);

                intent.putExtra("image", dashboard.getImgId());
                intent.putExtra("Name", dashboard.getName());
                intent.putExtra("Details", dashboard.getPhoneNo());

                mdashboard.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return dashboardList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgProfile;
        TextView tvName, tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);

        }

    }
}
