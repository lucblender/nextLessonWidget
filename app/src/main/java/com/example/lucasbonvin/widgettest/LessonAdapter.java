package com.example.lucasbonvin.widgettest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lucasbonvin.widgettest.Data.DataCsvManager;
import com.example.lucasbonvin.widgettest.Data.LessonLine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.LessonViewHolder>{
    private ArrayList<LessonLine> mLessonLines;

    public LessonAdapter(ArrayList<LessonLine> lessonLines)
    {
        mLessonLines = lessonLines;
    }

    @Override
    public LessonAdapter.LessonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create the view of item of recycler view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lessonweek, parent, false);
        return new LessonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {
        LessonLine lessonLine = mLessonLines.get(position);
        //temp string used to concatenate others
        String temp;

        //fulfill all text view from lesson
        temp = lessonLine.lessons[0].hourStart + " - "+lessonLine.lessons[0].hourEnd;
        holder.timeMon.setText(temp);
        holder.lessonMon.setText(lessonLine.lessons[0].lessonName );
        holder.locationMon.setText(lessonLine.lessons[0].city );
        holder.roomMon.setText(lessonLine.lessons[0].room );

        temp = lessonLine.lessons[1].hourStart + " - "+lessonLine.lessons[1].hourEnd;
        holder.timeTue.setText(temp);
        holder.lessonTue.setText(lessonLine.lessons[1].lessonName );
        holder.locationTue.setText(lessonLine.lessons[1].city );
        holder.roomTue.setText(lessonLine.lessons[1].room );

        temp = lessonLine.lessons[2].hourStart + " - "+lessonLine.lessons[2].hourEnd;
        holder.timeWed.setText(temp);
        holder.lessonWed.setText(lessonLine.lessons[2].lessonName );
        holder.locationWed.setText(lessonLine.lessons[2].city );
        holder.roomWed.setText(lessonLine.lessons[2].room );

        temp = lessonLine.lessons[3].hourStart + " - "+lessonLine.lessons[3].hourEnd;
        holder.timeThu.setText(temp);
        holder.lessonThu.setText(lessonLine.lessons[3].lessonName );
        holder.locationThu.setText(lessonLine.lessons[3].city );
        holder.roomThu.setText(lessonLine.lessons[3].room );

        temp = lessonLine.lessons[4].hourStart + " - "+lessonLine.lessons[4].hourEnd;
        holder.timeFri.setText(temp);
        holder.lessonFri.setText(lessonLine.lessons[4].lessonName );
        holder.locationFri.setText(lessonLine.lessons[4].city );
        holder.roomFri.setText(lessonLine.lessons[4].room );

        temp = lessonLine.lessons[5].hourStart + " - "+lessonLine.lessons[5].hourEnd;
        holder.timeSat.setText(temp);
        holder.lessonSat.setText(lessonLine.lessons[5].lessonName );
        holder.locationSat.setText(lessonLine.lessons[5].city );
        holder.roomSat.setText(lessonLine.lessons[5].room );

        temp = lessonLine.lessons[6].hourStart + " - "+lessonLine.lessons[6].hourEnd;
        holder.timeSun.setText(temp);
        holder.lessonSun.setText(lessonLine.lessons[6].lessonName );
        holder.locationSun.setText(lessonLine.lessons[6].city );
        holder.roomSun.setText(lessonLine.lessons[6].room );
    }

    @Override
    public int getItemCount() {
        return mLessonLines.size();
    }


    public class LessonViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{
        private final String TAG = LessonViewHolder.class.getName();

        //create all textview and will link them to R
        public TextView timeMon;
        public TextView lessonMon;
        public TextView locationMon;
        public TextView roomMon;

        public TextView timeTue;
        public TextView lessonTue;
        public TextView locationTue;
        public TextView roomTue;

        public TextView timeWed;
        public TextView lessonWed;
        public TextView locationWed;
        public TextView roomWed;

        public TextView timeThu;
        public TextView lessonThu;
        public TextView locationThu;
        public TextView roomThu;

        public TextView timeFri;
        public TextView lessonFri;
        public TextView locationFri;
        public TextView roomFri;

        public TextView timeSat;
        public TextView lessonSat;
        public TextView locationSat;
        public TextView roomSat;

        public TextView timeSun;
        public TextView lessonSun;
        public TextView locationSun;
        public TextView roomSun;

        public LinearLayout layoutMON;
        public LinearLayout layoutTUE;
        public LinearLayout layoutWED;
        public LinearLayout layoutTHU;
        public LinearLayout layoutFRI;
        public LinearLayout layoutSAT;
        public LinearLayout layoutSUN;

        private final Map<Integer, String> idToDay = new HashMap<>();
        private final Map<Integer, TextView> idToTimeTextView = new HashMap<>();
        private final Map<Integer, TextView> idToLessonTextView = new HashMap<>();

        public LessonViewHolder(View itemView) {

            super(itemView);

            //link all text view
            timeMon = (TextView) itemView.findViewById(R.id.timeMon);
            lessonMon = (TextView) itemView.findViewById(R.id.lessonMon);
            locationMon = (TextView) itemView.findViewById(R.id.locationMon);
            roomMon = (TextView) itemView.findViewById(R.id.roomMon);

            timeTue = (TextView) itemView.findViewById(R.id.timeTue);
            lessonTue = (TextView) itemView.findViewById(R.id.lessonTue);
            locationTue = (TextView) itemView.findViewById(R.id.locationTue);
            roomTue = (TextView) itemView.findViewById(R.id.roomTue);

            timeWed = (TextView) itemView.findViewById(R.id.timeWed);
            lessonWed = (TextView) itemView.findViewById(R.id.lessonWed);
            locationWed = (TextView) itemView.findViewById(R.id.locationWed);
            roomWed = (TextView) itemView.findViewById(R.id.roomWed);

            timeThu = (TextView) itemView.findViewById(R.id.timeThu);
            lessonThu = (TextView) itemView.findViewById(R.id.lessonThu);
            locationThu = (TextView) itemView.findViewById(R.id.locationThu);
            roomThu = (TextView) itemView.findViewById(R.id.roomThu);

            timeFri = (TextView) itemView.findViewById(R.id.timeFri);
            lessonFri = (TextView) itemView.findViewById(R.id.lessonFri);
            locationFri = (TextView) itemView.findViewById(R.id.locationFri);
            roomFri = (TextView) itemView.findViewById(R.id.roomFri);

            timeSat = (TextView) itemView.findViewById(R.id.timeSat);
            lessonSat = (TextView) itemView.findViewById(R.id.lessonSat);
            locationSat = (TextView) itemView.findViewById(R.id.locationSat);
            roomSat = (TextView) itemView.findViewById(R.id.roomSat);

            timeSun = (TextView) itemView.findViewById(R.id.timeSun);
            lessonSun = (TextView) itemView.findViewById(R.id.lessonSun);
            locationSun = (TextView) itemView.findViewById(R.id.locationSun);
            roomSun = (TextView) itemView.findViewById(R.id.roomSun);

            lessonMon.setSelected(true);
            lessonTue.setSelected(true);
            lessonWed.setSelected(true);
            lessonThu.setSelected(true);
            lessonFri.setSelected(true);
            lessonSat.setSelected(true);
            lessonSun.setSelected(true);

            locationMon.setSelected(true);
            locationTue.setSelected(true);
            locationWed.setSelected(true);
            locationThu.setSelected(true);
            locationFri.setSelected(true);
            locationSat.setSelected(true);
            locationSun.setSelected(true);

            roomMon.setSelected(true);
            roomTue.setSelected(true);
            roomWed.setSelected(true);
            roomThu.setSelected(true);
            roomFri.setSelected(true);
            roomSat.setSelected(true);
            roomSun.setSelected(true);

            layoutMON = (LinearLayout) itemView.findViewById(R.id.layoutMON);
            layoutTUE = (LinearLayout) itemView.findViewById(R.id.layoutTUE);
            layoutWED = (LinearLayout) itemView.findViewById(R.id.layoutWED);
            layoutTHU = (LinearLayout) itemView.findViewById(R.id.layoutTHU);
            layoutFRI = (LinearLayout) itemView.findViewById(R.id.layoutFRI);
            layoutSAT = (LinearLayout) itemView.findViewById(R.id.layoutSAT);
            layoutSUN = (LinearLayout) itemView.findViewById(R.id.layoutSUN);

            layoutMON.setOnLongClickListener(this);
            layoutTUE.setOnLongClickListener(this);
            layoutWED.setOnLongClickListener(this);
            layoutTHU.setOnLongClickListener(this);
            layoutFRI.setOnLongClickListener(this);
            layoutSAT.setOnLongClickListener(this);
            layoutSUN.setOnLongClickListener(this);

            idToDay.put(R.id.layoutMON, "Mon");
            idToDay.put(R.id.layoutTUE, "Tue");
            idToDay.put(R.id.layoutWED, "Wed");
            idToDay.put(R.id.layoutTHU, "Thu");
            idToDay.put(R.id.layoutFRI, "Fri");
            idToDay.put(R.id.layoutSAT, "Sat");
            idToDay.put(R.id.layoutSUN, "Sun");

            idToTimeTextView.put(R.id.layoutMON, timeMon);
            idToTimeTextView.put(R.id.layoutTUE, timeTue);
            idToTimeTextView.put(R.id.layoutWED, timeWed);
            idToTimeTextView.put(R.id.layoutTHU, timeThu);
            idToTimeTextView.put(R.id.layoutFRI, timeFri);
            idToTimeTextView.put(R.id.layoutSAT, timeSat);
            idToTimeTextView.put(R.id.layoutSUN, timeSun);

            idToLessonTextView.put(R.id.layoutMON, lessonMon);
            idToLessonTextView.put(R.id.layoutTUE, lessonTue);
            idToLessonTextView.put(R.id.layoutWED, lessonWed);
            idToLessonTextView.put(R.id.layoutTHU, lessonThu);
            idToLessonTextView.put(R.id.layoutFRI, lessonFri);
            idToLessonTextView.put(R.id.layoutSAT, lessonSat);
            idToLessonTextView.put(R.id.layoutSUN, lessonSun);
        }

        @Override
        public boolean onLongClick(View v) {

            final int position = this.getLayoutPosition();
            final View view = v;
            switch (v.getId())
            {
                case R.id.layoutMON:
                case R.id.layoutTUE:
                case R.id.layoutWED:
                case R.id.layoutTHU:
                case R.id.layoutFRI:
                case R.id.layoutSAT:
                case R.id.layoutSUN:
                    //when clicked on a layout, will check if the hours is not '-' --> mean lesson
                    if(!idToTimeTextView.get(v.getId()).getText().toString().equals(" - "))
                    {
                        //setup a popup to prevent miss-click
                        AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                        builder.setTitle("Delete");
                        builder.setMessage("Are you sure you want to delete \""+idToLessonTextView.get(view.getId()).getText()+"\" ?");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                DataCsvManager.getInstance().deleteLine(view.getContext(),idToDay.get(view.getId()), position);
                            }
                        });
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                        builder.show();
                    }
                    return true;
            }
            return false;
        }
    }
}
