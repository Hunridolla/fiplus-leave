package com.example.hunridolla.staffleave1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StaffRequestAdapter extends BaseAdapter {
    private ArrayList<StaffRequestModel> staffRequestModels;
    private LayoutInflater inflater;
    private Context context;

    public StaffRequestAdapter(Context context, ArrayList<StaffRequestModel> staffRequestModels) {
        this.staffRequestModels = staffRequestModels;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return staffRequestModels.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = inflater.inflate(R.layout.staff_request_list_view, null);
        TextView lbl_staff_name = v.findViewById(R.id.lbl_staff_name);
        TextView lbl_num_day_leave = v.findViewById(R.id.lbl_num_day_leave);
        TextView lbl_leave_period = v.findViewById(R.id.lbl_leave_period);
        TextView lbl_leave_hour = v.findViewById(R.id.lbl_leave_hour);
        TextView lbl_booking_time = v.findViewById(R.id.lbl_booking_time);

        StaffRequestModel staffRequestModel = staffRequestModels.get(i);
        lbl_staff_name.setText(staffRequestModel.getStaff_name());
        lbl_num_day_leave.setText(staffRequestModel.getNum_day_leave());
        lbl_leave_period.setText(staffRequestModel.getLeave_period());
        lbl_leave_hour.setText(staffRequestModel.getLeave_hour());
        lbl_booking_time.setText(staffRequestModel.getBooking_time());

        return v;
    }
}
