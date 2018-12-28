# Java Demo
#### 1.1.0
 - 2018-12-28 - [](https://github.com/SanjaykumarMehta/javademo/) by [Sanjay Mehta](https://github.com/SanjaykumarMehta/javademo/) (1) - published to [![Bintray](https://github.com/SanjaykumarMehta/javademo/)](https://github.com/SanjaykumarMehta/javademo)
 * Demo For:
   * 1: Spring Boot
     *  **Micro Service**

# Spring Boot


Spring Boot makes it easy to create Spring-powered, production-grade applications and
services with absolute minimum fuss. It takes an opinionated view of the Spring platform
so that new and existing users can quickly get to the bits they need.


```
	import org.springframework.boot.*;
	import org.springframework.boot.autoconfigure.*;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@SpringBootApplication
	public class Example {

		@RequestMapping("/")
		String home() {
			return "Hello World!";
		}

		public static void main(String[] args) throws Exception {
			SpringApplication.run(Example.class, args);
		}

	}
```

# Modules 
overview:



# spring-boot


* The `SpringApplication` class, providing static convenience methods that make it easy
to write a stand-alone Spring Application. Its sole job is to create and refresh an
appropriate Spring `ApplicationContext`
* Embedded web applications with a choice of container (Tomcat, Jetty or Undertow)
* First class externalized configuration support
* Convenience `ApplicationContext` initializers, including support for sensible logging
defaults


| TIP: The generated documentation is available from ``| 




Markdown Cheatsheet
===================

- - - - 

# Heading 1 #

    Markup :  # Heading 1 #

    -OR-

    Markup :  ============= (below H1 text)

## Heading 2 ##

    Markup :  ## Heading 2 ##

    -OR-

    Markup: --------------- (below H2 text)

### Heading 3 ###

    Markup :  ### Heading 3 ###

#### Heading 4 ####

    Markup :  #### Heading 4 ####


Common text

    Markup :  Common text

_Emphasized text_

    Markup :  _Emphasized text_ or *Emphasized text*

~~Strikethrough text~~

    Markup :  ~~Strikethrough text~~

__Strong text__

    Markup :  __Strong text__ or **Strong text**

___Strong emphasized text___

    Markup :  ___Strong emphasized text___ or ***Strong emphasized text***
   

Table, like this one :

First Header  | Second Header
------------- | -------------
Content Cell  | Content Cell
Content Cell  | Content Cell

```
First Header  | Second Header
------------- | -------------
Content Cell  | Content Cell
Content Cell  | Content Cell
```

`code()`

    Markup :  `code()`



* Bullet list
    * Nested bullet
        * Sub-nested bullet etc
* Bullet list item 2

~~~
 Markup : * Bullet list
              * Nested bullet
                  * Sub-nested bullet etc
          * Bullet list item 2
~~~

1. A numbered list
    1. A nested numbered list
    2. Which is numbered
2. Which is numbered

~~~
 Markup : 1. A numbered list
              1. A nested numbered list
              2. Which is numbered
          2. Which is numbered
~~~

- [ ] An uncompleted task
- [x] A completed task

~~~
 Markup : - [ ] An uncompleted task
          - [x] A completed task
~~~

> Blockquote
>> Nested blockquote

    Markup :  > Blockquote
              >> Nested Blockquote

_Horizontal line :_
- - - -

    Markup :  - - - -

_Image with alt :_

![picture alt](http://www.brightlightpictures.com/assets/images/portfolio/thethaw_header.jpg "Title is optional")

Foldable text:

<details>
  <summary>Title 1</summary>
  <p>Content 1 Content 1 Content 1 Content 1 Content 1</p>
</details>
<details>
  <summary>Title 2</summary>
  <p>Content 2 Content 2 Content 2 Content 2 Content 2</p>
</details>

    Markup : <details>
               <summary>Title 1</summary>
               <p>Content 1 Content 1 Content 1 Content 1 Content 1</p>
             </details>

```html
<h3>HTML</h3>
<p> Some HTML code here </p>
```

Hotkey:

<kbd>⌘F</kbd>

<kbd>⇧⌘F</kbd>

    Markup : <kbd>⌘F</kbd>

Hotkey list:

| Key | Symbol |
| --- | --- |
| Option | ⌥ |
| Control | ⌃ |
| Command | ⌘ |
| Shift | ⇧ |
| Caps Lock | ⇪ |
| Tab | ⇥ |
| Esc | ⎋ |
| Power | ⌽ |
| Return | ↩ |
| Delete | ⌫ |
| Up | ↑ |
| Down | ↓ |
| Left | ← |
| Right | → |

Emoji:

:exclamation: Use emoji icons to enhance text. :+1:  

    Markup : Code appears between colons :EMOJICODE:
    
#People
    
:bowtie:            :smile:        :laughing:            :blush:                   :smiley:
:relaxed:           :smirk:            :heart_eyes:              :kissing_heart:       :kissing_closed_eyes:     :flushed:
:relieved:  :satisfied:  :grin:  :wink:   :stuck_out_tongue_winking_eye:  :stuck_out_tongue_closed_eyes:   :grinning: :kissing:
:kissing_smiling_eyes:   :stuck_out_tongue:  :sleeping:  :worried:  :frowning:  :anguished:  :open_mouth:   :grimacing:   :confused:
:hushed:   :expressionless:   :unamused:   :sweat_smile:   :sweat:   :disappointed_relieved:   :weary:   :pensive:   :disappointed:
:confounded:   :fearful:   :cold_sweat:   :persevere:   :cry:   :sob:   :joy:   :astonished:   :scream:   :neckbeard:
:tired_face:   :angry:   :rage:   :triumph:   :sleepy:   :yum:   :mask:   :sunglasses:   :dizzy_face:   :imp:   :smiling_imp:
:neutral_face:
:no_mouth:
:innocent:
:alien:
:yellow_heart:
:blue_heart:
:purple_heart:
:heart:
:green_heart:
:broken_heart:
:heartbeat:
:heartpulse:
:two_hearts:
:revolving_hearts:
:cupid:
:sparkling_heart:
:sparkles:
:star:
:star2:
:dizzy:
:boom:
:collision:
:anger:
:exclamation:
:question:
:grey_exclamation:
:grey_question:
:zzz:
:dash:
:sweat_drops:
:notes:
:musical_note:
:fire:
:hankey:
:poop:
:shit:
:+1:
:thumbsup:
:-1:
:thumbsdown:
:ok_hand:
:punch:
:facepunch:
:fist:
:v:
:wave:
:hand:
:raised_hand:
:open_hands:
:point_up:
:point_down:
:point_left:
:point_right:
:raised_hands:
:pray:
:point_up_2:
:clap:
:muscle:
:metal:
:fu:
:runner:
:running:
:couple:
:family:
:two_men_holding_hands:
:two_women_holding_hands:
:dancer:
:dancers:
:ok_woman:
:no_good:
:information_desk_person:   :raising_hand:   :bride_with_veil:   :person_with_pouting_face:   :person_frowning:   :bow:
:couplekiss:  :couple_kiss: :simple_smile:      :couple_with_heart:
:massage:   :haircut:   :nail_care:   :boy:   :woman:  :girl:  :woman:   :man:   :baby:   :older_woman:   :older_man:
:person_with_blond_hair:   :man_with_gua_pi_mao:   :man_with_turban:   :construction_worker:   :cop:   :angel:   :princess:   :smiley_cat:   :smile_cat:   :heart_eyes_cat:   :kissing_cat:   :smirk_cat:   :scream_cat:   :crying_cat_face:
:joy_cat:   :pouting_cat:   :japanese_ogre:   :japanese_goblin:   :see_no_evil:   :hear_no_evil:   :speak_no_evil:
:guardsman:   :skull:   :feet:   :lips:   :kiss:   :droplet:
:ear:   :eyes:   :nose:   :tongue:   :love_letter:   :bust_in_silhouette:   :busts_in_silhouette:   :speech_balloon:   :thought_balloon:
:feelsgood:   :finnadie:   :goberserk:   :godmode:   :hurtrealbad:   :rage1:   :rage2:   :rage3:   :rage4:   :suspect:   :trollface:


#Nature

:sunny:   :umbrella:   :cloud:  :snowflake:   :snowman:  :zap:   :cyclone:   :foggy:  :ocean:   :cat:   :dog:   :mouse:  :hamster:
:rabbit:  :wolf:  :frog:  :tiger:  :koala:  :bear:  :pig:  :pig_nose:  :cow:  :boar: :monkey_face:  :monkey:   :horse:   :racehorse:
:camel:   :sheep:   :elephant:   :panda_face:   :snake:   :bird:   :baby_chick:   :hatched_chick:   :hatching_chick:   :chicken:
:penguin:   :turtle:   :bug:   :honeybee:   :ant:   :beetle:   :snail:   :octopus:   :tropical_fish:   :fish:   :whale:
:whale2:   :dolphin:   :cow2:   :ram:   :rat:   :water_buffalo:   :tiger2:   :rabbit2:   :dragon:   :goat:   :rooster:
:dog2:   :pig2:   :mouse2:   :ox:   :dragon_face:   :blowfish:   :crocodile:   :dromedary_camel:   :leopard:   :cat2:
:poodle:   :paw_prints:   :bouquet:   :cherry_blossom:
:tulip:   :four_leaf_clover:
:rose:   :sunflower:
:hibiscus:   :maple_leaf:
:leaves:   :fallen_leaf:
:herb:   :mushroom:
:cactus:   :palm_tree:
:evergreen_tree:   :deciduous_tree:
:chestnut:   :seedling:
:blossom:   :ear_of_rice:
:shell:   :globe_with_meridians:
:sun_with_face:   :full_moon_with_face:   :new_moon_with_face:   :new_moon:   :waxing_crescent_moon:   :first_quarter_moon:
:waxing_gibbous_moon:
:full_moon:
:waning_gibbous_moon:
:last_quarter_moon:
:waning_crescent_moon:
:last_quarter_moon_with_face:
:first_quarter_moon_with_face:
:crescent_moon:
:earth_africa:
:earth_americas:
:earth_asia:
:volcano:
:milky_way:
:partly_sunny:
:octocat:
:squirrel:

# Objects

:bamboo:
:gift_heart:
:dolls:
:school_satchel:
:mortar_board:
:flags:
:fireworks:
:sparkler:
:wind_chime:
:rice_scene:
:jack_o_lantern:
:ghost:
:santa:   :christmas_tree:
:gift:
:bell:
:no_bell:
:tanabata_tree:
:tada:
:confetti_ball:
:balloon:
:crystal_ball:
:cd:
:dvd:
:floppy_disk:
:camera:
:video_camera:
:movie_camera:
:computer:
:tv:
:iphone:
:phone:
:telephone:
:telephone_receiver:
:pager:
:fax:
:minidisc:
:vhs:
:sound:
:speaker:
:mute:
:loudspeaker:
:mega:
:hourglass:
:hourglass_flowing_sand:
:alarm_clock:
:watch:
:radio:
:satellite:
:loop:
:mag:
:mag_right:   :unlock:
:lock:   :lock_with_ink_pen:
:closed_lock_with_key:    :key:
:bulb:   :flashlight:    :high_brightness:
:low_brightness:   :electric_plug:
:battery:   :calling:   :email:   :mailbox:   :postbox:   :bath:   :bathtub:   :shower:   :toilet:   :wrench:   :nut_and_bolt:
:hammer:   :seat:   :moneybag:  :yen:   :dollar:   :pound:   :euro:   :credit_card:   :money_with_wings:    :e-mail:   :inbox_tray:
:outbox_tray:   :envelope:   :incoming_envelope:   :postal_horn:   :mailbox_closed:   :mailbox_with_mail:   :mailbox_with_no_mail:
:package:   :door:   :smoking:   :bomb:   :gun:   :hocho:   :pill:   :syringe:
:page_facing_up:   :page_with_curl:   :bookmark_tabs:   :bar_chart:   :chart_with_upwards_trend:   :chart_with_downwards_trend:   :scroll:
:clipboard:
:calendar:
:date:
:card_index:
:file_folder:
:open_file_folder:
:scissors:
:pushpin:
:paperclip:
:black_nib:
:pencil2:
:straight_ruler:
:triangular_ruler:
:closed_book:
:green_book:
:blue_book:
:orange_book:
:notebook:
:notebook_with_decorative_cover:
:ledger:
:books:
:bookmark:
:name_badge:
:microscope:
:telescope:
:newspaper:
:football:
:basketball:
:soccer:
:baseball:
:tennis:
:8ball:
:rugby_football:
:bowling:
:golf:
:mountain_bicyclist:
:bicyclist:
:horse_racing:
:snowboarder:
:swimmer:
:surfer:
:ski:
:spades:
:hearts:
:clubs:
:diamonds:
:gem:
:ring:
:trophy:
:musical_score:
:musical_keyboard:
:violin:   :space_invader:   :video_game:   :black_joker:   :flower_playing_cards:   :game_die:   :dart:   :mahjong:   :clapper:
:memo:   :pencil:   :book:   :art:   :microphone:   :headphones:   :trumpet:   :saxophone:   :guitar:   :shoe:   :sandal:
:high_heel:   :lipstick:   :boot:   :shirt:   :tshirt:   :necktie:   :womans_clothes:   :dress:   :running_shirt_with_sash:
:jeans:   :kimono:   :bikini:   :ribbon:   :tophat:   :crown:   :womans_hat:   :mans_shoe:   :closed_umbrella:
:briefcase:   :handbag:   :pouch:   :purse:   :eyeglasses:   :fishing_pole_and_fish:   :coffee:   :tea:
:sake:   :baby_bottle:   :beer:   :beers:   :cocktail:   :tropical_drink:   :wine_glass:   :fork_and_knife:   :pizza:   :hamburger:
:fries:   :poultry_leg:   :meat_on_bone:   :spaghetti:   :curry:   :fried_shrimp:   :bento:   :sushi:   :fish_cake:   :rice_ball:
:rice_cracker:   :rice:   :ramen:   :stew:   :oden:   :dango:   :egg:   :bread:   :doughnut:   :custard:   :icecream:   :ice_cream:
:shaved_ice:   :birthday:   :cake:   :cookie:   :chocolate_bar:   :candy:   :lollipop:   :honey_pot:   :apple:   :green_apple:   :tangerine:   :lemon:   :cherries:   :grapes:   :watermelon:   :strawberry:   :peach:   :melon:   :banana:   :pear:   :pineapple:   :sweet_potato:   :eggplant:   :tomato:   :corn:

#Places

:house: :house_with_garden:   :school:   :office:   :post_office:   :hospital:   :bank:   :convenience_store:
:love_hotel:   :hotel:   :wedding:   :church:   :department_store:   :european_post_office:   :city_sunrise:
:city_sunset:   :japanese_castle:   :european_castle:   :tent:   :factory:   :tokyo_tower:   :japan:   :mount_fuji:
:sunrise_over_mountains:   :sunrise:   :stars:   :statue_of_liberty:   :bridge_at_night:   :carousel_horse:   :rainbow:
:ferris_wheel:   :fountain:   :roller_coaster:   :ship:   :speedboat:   :boat:   :sailboat:   :rowboat:
:anchor:   :rocket:   :airplane:   :helicopter:   :steam_locomotive:   :tram:   :mountain_railway:
:bike:   :aerial_tramway:   :suspension_railway:   :mountain_cableway:   :tractor:   :blue_car:   :oncoming_automobile:
:car:   :red_car:   :taxi:   :oncoming_taxi:   :articulated_lorry:   :bus:   :oncoming_bus:   :rotating_light:
:police_car:   :oncoming_police_car:   :fire_engine:   :ambulance:   :minibus:   :truck:   :train:   :station:
:train2:   :bullettrain_front:  :bullettrain_side:   :light_rail:   :monorail:   :railway_car:   :trolleybus:
:ticket:   :fuelpump:   :vertical_traffic_light:   :traffic_light:   :warning:   :construction:   :beginner:   :atm:
:slot_machine:   :busstop:   :barber:   :hotsprings:   :checkered_flag:   :crossed_flags:   :izakaya_lantern:
:moyai:   :circus_tent:   :performing_arts:   :round_pushpin:   :triangular_flag_on_post:
:in:  :IN:  :jp:  :JP:
:jp:   :kr:   :cn:   :us:   :fr:   :es:   :it:    :ru:    :gb:    :uk:  :de:

#Symbols    

:one:    :two:    :three:    :four:    :five:        :six:    :seven:    :eight:    :nine:    :keycap_ten:    :1234:
:zero:    :hash:     :symbols:    :arrow_backward:    :arrow_down:    :arrow_forward:    :arrow_left:    :capital_abcd:
:abcd:    :abc:     :arrow_lower_left:    :arrow_lower_right:     :arrow_right:    :arrow_up:
:arrow_upper_left:    :arrow_upper_right:    :arrow_double_down:    :arrow_double_up:
:arrow_down_small:    :arrow_heading_down:    :arrow_heading_up:  :leftwards_arrow_with_hook:
:arrow_right_hook:    :left_right_arrow:  :arrow_up_down:
:arrow_up_small:    :arrows_clockwise:    :information_source:     
:arrows_counterclockwise:  :information_source:           :rewind:  :fast_forward:   :information_source:     :ok:
:twisted_rightwards_arrows:      :repeat:    :repeat_one:    :new:   :top:     :up:  :cool:     :free:
:ng:     :cinema:  :koko:     :signal_strength:
:u5272:     :u5408:  :u55b6:     :u6307:    :u6708:     :u6709:  :u6e80:     :u7121:
:u7533:     :u7a7a:  :u7981:     :sa:  :restroom:     :mens:  :womens:     :baby_symbol:
:no_smoking:     :parking:  :wheelchair:     :metro:  :baggage_claim:     :accept:  :wc:     :potable_water:
:put_litter_in_its_place:     :secret:  :congratulations:     :m:
:passport_control:     :left_luggage:  :customs:     :ideograph_advantage:  :cl:     :sos:  :id:     :no_entry_sign:
:underage:     :no_mobile_phones:  :do_not_litter:     :non-potable_water:
:no_bicycles:     :no_pedestrians:  :children_crossing:     :no_entry:     :eight_spoked_asterisk:     :sparkle:     :eight_pointed_black_star:     :heart_decoration:     
:vs:     :vibration_mode:     :mobile_phone_off:     :chart:     :currency_exchange:     :aries:     :taurus:     :gemini:
:cancer:     :leo:     :virgo:     :libra:     :scorpius:     :sagittarius:     :capricorn:     :aquarius:
:pisces:     :ophiuchus:     :six_pointed_star:     :negative_squared_cross_mark:
:a:     :b:     :ab:     :o2:     :diamond_shape_with_a_dot_inside:     :recycle:     :end:     :back:     :on:     :soon:
:clock1:     :clock130:     :clock10:     :clock1030:     :clock11:     :clock1130:
:clock12:   :clock1230:     :clock2:     :clock230:     :clock3:     :clock330:     :clock4:     :clock430:     :clock5:     :clock530:
:clock6:  :clock630:     :clock7:     :clock730:     :clock8:     :clock830:     :clock9:     :clock930:
:heavy_dollar_sign:     :copyright:     :registered:
:tm:     :x:     :heavy_exclamation_mark:     :bangbang:     :interrobang:     :o:     :heavy_multiplication_x:     :heavy_plus_sign:
:heavy_minus_sign:     :heavy_division_sign:     :white_flower:     :100:     :heavy_check_mark:     :ballot_box_with_check:
:radio_button:     :link:     :curly_loop:     :wavy_dash:     :part_alternation_mark:     :trident:     :black_small_square:     
:white_small_square:     :black_medium_small_square:     :white_medium_small_square:     :black_medium_square:    :white_medium_square:
:black_large_square:     :white_large_square:     :white_check_mark:     :black_square_button:     :white_square_button:
:black_circle:     :white_circle:     :red_circle:     :large_blue_circle:     :large_blue_diamond:
:large_orange_diamond: :small_blue_diamond:  :small_orange_diamond: :small_red_triangle:     :small_red_triangle_down: :shipit:

Campfire also supports a few sounds
► /play secret► /play trombone► /play crickets► /play rimshot► /play vuvuzela► /play tmyk► /play live► /play drama► /play yeah► /play greatjob► /play pushit► /play nyan► /play tada► /play ohmy► /play bueller► /play ohyeah► /play 56k► /play dangerzone► /play horn► /play horror► /play loggins► /play yodel► /play sax► /play noooo► /play heygirl► /play inconceivable► /play deeper► /play whoomp► /play clowntown► /play what► /play bezos► /play trololo► /play makeitso► /play sexyback► /play bell► /play danielsan► /play greyjoy► /play story► /play dadgummit► /play rollout► /play cottoneyejoe► /play rumble► /play guarantee► /play unix► /play letitgo► /play wups► /play flawless► /play butts
