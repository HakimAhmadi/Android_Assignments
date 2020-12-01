package com.example.mad_assignment10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class Activity2_body extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_body);

        String carn= getIntent().getStringExtra("carname");
        ImageView carwallpaper= findViewById(R.id.CarImage2);


        TextView carDetail= findViewById(R.id.CarDetail);
        HashMap<String,String>  data = new HashMap<>();

        data.put("toyota","Toyota\nToyota brings back the Supra for 2020 after being absent from its. Sharing components with the BMW Z4 roadster, the two-seater’s bodywork is radically curvy, with a “double bubble” roof and long and pronounced scoops along the sides. It packs a turbocharged 3.0-liter inline six-cylinder engine that channels 335 horsepower and 365 pound-feet of torque to the rear wheels. Coming with an eight-speed automatic transmission, the GR Supra is good for a 4.1-second 0-60 mph run. A sophisticated suspension, active rear differential and a perfect 50:50 front-to-rear weight ratio combine for crisp cornering abilities. It starts at just shy of $51,000.");
        data.put("tesla","Tesla\nBarring any production delays, the full-electric Tesla Roadster is expected to return for model year 2020 and hit the ground running. It features a decidedly modernistic curvy profile and promises rocket-like performance. A lightweight glass roof panel stores in the car’s trunk. Tesla claims it will be the fastest car on the planet, and one that can seat four at that. It’s said to make the leap to 60 mph in a sudden 1.9 seconds, with a highly illegal top speed of 250 mph. It’s operating range is claimed to be as much as 620 miles on a charge. The Roadster starts at $200,000, with prospective owners asked to put up a $50,000 reservation to be among the first to own one.");
        data.put("porsche","Porsche\nPorsche’s first-ever eclectic electric ride is an ultra-sleek battery-driven four-door sports car. It’s appropriately attractive with well-balanced proportions and Porsche styling cues. Porsche says the name Taycan is derived from two terms of Turkic origin, and can be roughly translated as “soul of a spirited young horse.” Two synchronous motors will generate in excess of 600 hp, and enable the Tacan to reach 60 mph in around 3.5 seconds. Porsche is targeting a range of over 300 miles with a full battery, and its 800-volt system will enable the car to recover 60 miles of range in four minutes via public fast-charging stations. What’s more, Taycan buyers will receive three years of unlimited 30-minute charging via the Electrify America network.");
        data.put("mclaren","McLaren\nSupercar maker McLaren debuts its first grand touring car for 2020, the appropriately named GT. A grand tourer is traditionally a more accommodating alternative to a flat out sports car that can be used as a daily driver or taken on extended road trips comfortably. The GT rides on a carbon fiber structure and its super sleek bodywork is comprised of aluminum panels, both for the sake of weight reduction. Its interior is both posh and driver focused, and a wealth of features includes a sophisticated infotainment system. A 4.0-liter V8 engine generates a lusty 612 horsepower with 465 pound-feet of launch happy torque. The automaker says it will reach 60 mph in a quick 3.1 seconds with a top speed of 203 mph. A new Proactive Damping Control suspension promises a smooth ride, while maintaining the appropriate McLaren levels of driving dynamics. Base price is a cool $210,000.");
        data.put("ford","Ford\nThe 2020 Ford Mustang Shelby GT500 takes the original “pony car” to new levels of performance to keep up with the likes of the Chevrolet Camaro ZL1 and the Dodge Challenger SRT Hellcat. A hand-built supercharged 5.2-liter V8 engine channels a whopping 760 horsepower and 625 pound-feet of torque through the rear wheels via a seven-speed dual clutch automatic transmission. Ford says it can make the sprint to 60 mph in less than three seconds. There’s also suspension and steering upgrades, along with what Ford calls the largest front brake rotors ever available on an American sports coupe to help rein in all those raging horses. You’ll have to leave the kids at home, however, as the GT500 deletes the back seat to save weight.");


        if (data.containsKey(carn)){
            switch (carn){
                case "toyota":
                    carwallpaper.setImageResource(R.drawable.toyota);
                    break;
                case "tesla":
                    carwallpaper.setImageResource(R.drawable.tesla);
                    break;
                case "porsche":
                    carwallpaper.setImageResource(R.drawable.porsche);
                    break;
                case "mclaren":
                    carwallpaper.setImageResource(R.drawable.mclaren);
                    break;
                case "ford":
                    carwallpaper.setImageResource(R.drawable.ford);
                    break;
            }
            carDetail.setMovementMethod(new ScrollingMovementMethod());
            carDetail.setText(data.get(carn));

        }
        else{
            carDetail.setText("No Car found with that name");
        }
    }

}