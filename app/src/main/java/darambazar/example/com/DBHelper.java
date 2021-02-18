package darambazar.example.com;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "asuultuud";

    public DBHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE asuultuud " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "asuult NVARCHAR(255),"+
                "h1 NVARCHAR(255),"+
                "h2 NVARCHAR(255),"+
                "h3 NVARCHAR(255),"+
                "h4 NVARCHAR(255),"+
                "torol NVARCHAR(255),"+
                "zov NVARCHAR(255))";
        db.execSQL(sql);
        String[] asuultuud=new String[60];
        asuultuud[0]="INSERT INTO asuultuud VALUES('1','Орчин үеийн хөлбөмбөгийн дүрмийг анх Английн Хөлбөмбөгийн холбоо хэдэн онд The Laws of the Game гаргасан бэ?','1910','1863','1950','1866','хөл бөмбөг','1863') ";
         asuultuud[1]="INSERT INTO asuultuud VALUES('2','ФИФА-гаар бол шинжлэх ухаанаар батлагдсан хамгийн анхны бөмбөг өшиглөх тоглоомоор МЭӨ 2-3-р зуунд хаана тоглож байсан бэ?','USA','Brazil','Italy','Russia','хөл бөмбөг','USA') ";
         asuultuud[2]="INSERT INTO asuultuud VALUES('3','1863 оны хэдэн сарын хэдэнд Лондоны Квин гудамжны Фриймэйсоны уушын газарт анхны хөлбөмбөгийн холбооны уулзалт болж байсан бэ?','4-11','1-12','7-3','10-26','хөл бөмбөг','10-26') ";
         asuultuud[3]="INSERT INTO asuultuud VALUES('4','Дэлхийн хамгийн эртний хөлбөмбөгийн тэмцээн аль нь вэ?','World cup','Premiere league','FA cup','Euro','хөл бөмбөг','FA cup') ";
         asuultuud[4]="INSERT INTO asuultuud VALUES('5','Хамгийн анхны олон улсын хөлбөмбөгийн тоглолт Англи Шотландын багуудын хооронд болсон бол энэ тоглолт хэзээ болж байсан бэ?','1872','1881','1866','1900','хөл бөмбөг','1872') ";
         asuultuud[5]="INSERT INTO asuultuud VALUES('6','Олон улсын хөлбөмбөгийн дүрмээр бол талбайн өргөний хэмжээ нь 64-75 метр бол урт нь хэд байдаг вэ?','110-120','140-160','155-200','85-100','хөл бөмбөг','110-120') ";
         asuultuud[6]="INSERT INTO asuultuud VALUES('7','Хаалганы өргөн нь 7.3 метр бол өндөр нь хэд байдаг вэ?','2','2.6','3','2.4','хөл бөмбөг','2.4') ";
         asuultuud[7]="INSERT INTO asuultuud VALUES('8','Хөлбөмбөгийн дэлхийн аварга шалгаруулах тэмцээн нь 1930 оноос эхлэн дөрвөн жил тутамд зохиогдсоор ирсэн ба дайны улмаас 2 удаа  алгасч байсан нь хэзээ вэ?','1942,1946','1934,1938','1950,1954','1958,1962','хөл бөмбөг','1942,1946') ";
         asuultuud[8]="INSERT INTO asuultuud VALUES('9','Роналду Дэлхийн аварга шалгаруулах тэмцээнд Испанийн эсрэг хийсэн тоглолтонд үзүүлсэн хурд  нь дэлхийн хөлбөмбөгийн аварга шалгаруулах тэмцээний түүхэн дэх хурдны шинэ дээд амжилт аж.Энэ хурд хэд байдаг вэ?','35.7km/h','40.3km/h','29.6km/h','38.6km/h','хөл бөмбөг','38.6km/h') ";
         asuultuud[9]="INSERT INTO asuultuud VALUES('10','Дэлхийн аварга шалгаруулах тэмцээний түүхэн дэх хамгийн “хурдан” шар хуудас өгсөн тоглолт Мексик болон Шведийн хоорондын тоглолтонд болсон хэр хурдан авсан бэ?','55c','15c','33c','29c','хөл бөмбөг','15c') ";
         asuultuud[10]="INSERT INTO asuultuud VALUES('11','Хэдэн оны ДАШТ-д  тэмцээнд оролцсон багуудын тоглогчид өөрсдийн хаалгандаа 12 гоол хийсэн бэ?','2010','2006','2018','2002','хөл бөмбөг','2018') ";
         asuultuud[11]="INSERT INTO asuultuud VALUES('12','Дэлхийн аваргын түүхэн дэх хамгийн хөгшин хөлбөмбөгчин Египетийн хаалгач Эссам Эль-Хадари нь хэдэн настай  бэ?','45','42','39','49','хөл бөмбөг','45') ";
         asuultuud[12]="INSERT INTO asuultuud VALUES('13','2018 оны ДАШТ-нд торгуулийн цохилтыг түүхэнд хамгийн олон удаа өгсөн буюу тэмцээний үеэр хичнээн цохилт зааж байсан бэ?','14','24','28','19','хөл бөмбөг','28') ";
         asuultuud[13]="INSERT INTO asuultuud VALUES('14','Хөлбөмбөгийн түүхэнд Үхлийн тоглолт хэмээн тэмдэглэгдсэн тоглолт хэдэн онд болсон бэ?','1947','1945','1939','1942','хөл бөмбөг','1942') ";
         asuultuud[14]="INSERT INTO asuultuud VALUES('15','Премьер лигийн 76 см-ийн өндөртэй, 43 см-ийн өргөнтэй, 25 см-ийн хонхор цомыг тансаг үнэт эдлэлийн Asprey компани урласан бол жин нь хэд вэ?','18','25','30','15','хөл бөмбөг','25') ";
         asuultuud[15]="INSERT INTO asuultuud VALUES('16','Премьер лигт бүх цаг үед хамгийн олон гоол оруулсан тоглогчидыг Блэкберн Роверс болон Ньюкасл Юнайтед клубүүдэд тоглож байсан довтлогч Алан Ширер тэргүүлдэг бол хэдэн гоол оруулсан бэ?','260','250','300','220','хөл бөмбөг','260') ";
         asuultuud[16]="INSERT INTO asuultuud VALUES('17','Английн хөлбөмбөг нийт хэдэн дивизионоос   бүрддэг вэ?','20','25','23','28','хөл бөмбөг','23') ";
         asuultuud[17]="INSERT INTO asuultuud VALUES('18','Анхны хет-трик буюу гурван гоолыг Германы тоглогч Конен аль багийн эсрэг оруулсан бэ?','Germany','Uruguay','Italy','Belgium','хөл бөмбөг','Belgium') ";
         asuultuud[18]="INSERT INTO asuultuud VALUES('19','Бразилд очих зардал их гэсэн шалтгаанаар Энэтхэг сайн дураар ДАШТ-с татгалзав. Үнэн хэрэгтээ тэдний гол шалтгаан нь юу байсан бэ?','Гуталгүйн улмаас','Цаг агаар','Хол учир','Эрүүл мэнд','хөл бөмбөг','Гуталгүйн улмаас') ";
         asuultuud[19]="INSERT INTO asuultuud VALUES('20','Дэлхийн аваргын анхны бэлгэдэл сахиусыг хийсэн нь Британийн далбааны өмсгөлтэй ямар амьтан байдаг вэ?','Бар','Баавгай','Луу','Шувуу','хөл бөмбөг','Баавгай') ";

        asuultuud[20]="INSERT INTO asuultuud VALUES('21','NBA буюу америкын үндэсний сагсанбөмбөгийн логон дээр хэн гэдэг тамирчин дүрслэгдсэн   байдаг вэ?','Jerry West','Kobe Bryant','Larry Bird','LeBron James','сагсан бөмбөг','Jerry West') ";
        asuultuud[21]="INSERT INTO asuultuud VALUES('22','NBA буюу америкын үндэсний сагсанбөмбөгийн нэг тоглолтонд авсан хамгийн их оноо хэд вэ?','50','60','90','100','сагсан бөмбөг','100') ";
        asuultuud[22]="INSERT INTO asuultuud VALUES('23','Kobe Bryant NBA-д Draft-н хэдээр орж ирсэн бэ?','1995','1996','1997','1998','сагсан бөмбөг','1996') ";
        asuultuud[23]="INSERT INTO asuultuud VALUES('24','NBA-н одоогийн ерөнхийлөгчийн нэр?','Walter Kennedy','Larry O Brien','David Stern','Adam Silver','сагсан бөмбөг','Adam Silver') ";
        asuultuud[24]="INSERT INTO asuultuud VALUES('25','Micheal Jordan хэдэн удаагын улиралын MVP бэ?','3','4','5','6','сагсан бөмбөг','5') ";
        asuultuud[25]="INSERT INTO asuultuud VALUES('26','Draft хэдэн оноос анх явагдаж эхэлсэн бэ?','1950','1960','1970','1980','сагсан бөмбөг','1950') ";
        asuultuud[26]="INSERT INTO asuultuud VALUES('27','NBA-д хамгийн их түрүүлсэн баг?','LA Lakers','Boston Celtics','Indiana','Orlando Magic','сагсан бөмбөг','Boston Celtics') ";
        asuultuud[27]="INSERT INTO asuultuud VALUES('28','Сагсан бөмбөгийн дүрмээр хэдэн метрийн өндөр шонгийн самбарт цагираг бэхлэгдсэн байхаар тогтсон байдаг вэ?','3.05','3','3.1','3.005','сагсан бөмбөг','3.05') ";
        asuultuud[28]="INSERT INTO asuultuud VALUES('29','Нэг тоглолтонд 100н оноо авсан тоглогч?','Wilt Chamberlain','Kobe Bryant','Michel Jordan','Hakeem Olajuwon','сагсан бөмбөг','Wilt Chamberlain') ";
        asuultuud[29]="INSERT INTO asuultuud VALUES('30','2019 онд NBA-д аль баг түрүүлсэн бэ?','Lakers','Boston','Toronto','Warriors','сагсан бөмбөг','Toronto') ";
        asuultuud[30]="INSERT INTO asuultuud VALUES('31','Kobe Bryant хэдэн удаагын улиралын MVP бэ?','1','2','3','4','сагсан бөмбөг','1') ";
        asuultuud[31]="INSERT INTO asuultuud VALUES('32','NBA-н анхны ерөнхийлөгчийн нэр?','Walter Kennedy','Larry O Brien','David Stern','Adam Silver','сагсан бөмбөг','Walter Kennedy') ";
        asuultuud[32]="INSERT INTO asuultuud VALUES('33','Derrick Rose NBA-д Draft-н хэдээр орж ирсэн бэ?','1','2','3','4','сагсан бөмбөг','1') ";
        asuultuud[33]="INSERT INTO asuultuud VALUES('34','NBA-н нэг тоглолтонд хамгийн их хаалтыг хэн хийсэн бэ?','Kobe Bryant','Magic Johnson','Larry Bird','Wilt Chamberlain','сагсан бөмбөг','Wilt Chamberlain') ";
        asuultuud[34]="INSERT INTO asuultuud VALUES('35','NBA-д нэг үед хамгийн их оноог хэн авсан бэ?','Kobe Bryant','Magic Johnson','Larry Bird','Klay Thompson','сагсан бөмбөг','Klay Thompson') ";
        asuultuud[35]="INSERT INTO asuultuud VALUES('36','NBA түүхэнд хамгийн их тоглолтонд   оролцсон тоглогч? ','Kobe Bryant','Vince Carter','Larry Bird','Lebron James','сагсан бөмбөг','Vince Carter') ";
        asuultuud[36]="INSERT INTO asuultuud VALUES('37','Kyle Korver NBA-д Draft-н хэдээр орж ирсэн бэ?','31','42','53','64','сагсан бөмбөг','64') ";
        asuultuud[37]="INSERT INTO asuultuud VALUES('38','Бурхны 4н хөвгүүний нэг Allen Iverson хочыг юу гэдэг байсан бэ?','The Answer','The Question','Mr. Drew','WhiteMan','сагсан бөмбөг','The Answer') ";
        asuultuud[38]="INSERT INTO asuultuud VALUES('39','2015 оноос хойш NBA-д 5 дарааллаж финалдсан баг аль нь вэ?','Lakers','Boston','Toronto','Warriors','сагсан бөмбөг','Warriors') ";
        asuultuud[39]="INSERT INTO asuultuud VALUES('40','2017  онд NBA-д  GS Warriors-той финалын тоглолтонд Lebron James хэн дээр хаалт хийж багаа аварч аваргалсан бэ?','Igoudala','Thompson','Green','Curry','сагсан бөмбөг','Igoudala') ";

        asuultuud[40]="INSERT INTO asuultuud VALUES('41','Цэнхэр, шар өнгөний дундаас ямар өнгө гардаг вэ? ','Шар','Ногоон','Улаан','Хар','танин мэдэхүй','Ногоон') ";
        asuultuud[41]="INSERT INTO asuultuud VALUES('42','МУ-ын үндсэн хууль хэдэн бүлэгтэй вэ?','4','5','6','7','танин мэдэхүй','6') ";
        asuultuud[42]="INSERT INTO asuultuud VALUES('43','Бачим гэж ямар утгыг илэрхийлж байна вэ?','Хэлгүй','Хэлтэй','Яаралтай','Яаралгүй','танин мэдэхүй','Яаралтай') ";
        asuultuud[43]="INSERT INTO asuultuud VALUES('44','Ямар амьтныг монгол бичигт мэнэхэй гэж бичдэг вэ?','Матар','Мич','Мэлхий','Туулай','танин мэдэхүй','Мэлхий') ";
        asuultuud[44]="INSERT INTO asuultuud VALUES('45','Хүргэний хүүхэд?','Ач','Гуч','Зээ','Зээнцэр','танин мэдэхүй','Зээ') ";
        asuultuud[45]="INSERT INTO asuultuud VALUES('46','Үнэгний зулзага?','Бүжин','Гавар','Дэгдээхий','Гөлөг','танин мэдэхүй','Гавар') ";
        asuultuud[46]="INSERT INTO asuultuud VALUES('47','Монголын хамгийн сүүлчийн хааны хатан хэн бэ?','Дондогдулам','Ану','Мандухай','Бөртэ','танин мэдэхүй','Дондогдулам') ";
        asuultuud[47]="INSERT INTO asuultuud VALUES('48','Дэлхийн хэдэн хувийг ус эзэлдэг вэ?','71','70','69','69','танин мэдэхүй','71') ";
        asuultuud[48]="INSERT INTO asuultuud VALUES('49','Хүний биеийн хэдэн хувийг ус эзэлдэг вэ?','40','50','60','70','танин мэдэхүй','70') ";
        asuultuud[49]="INSERT INTO asuultuud VALUES('50','Му-ын төв цэг?','Булган','Өвөрхангай','Төв','Сүхбаатар','танин мэдэхүй','Өвөрхангай') ";
        asuultuud[50]="INSERT INTO asuultuud VALUES('51','Цаглавар гэж юуг хэлдэг вэ?','Цаг','Цаглабар','Цаг тооны бичиг','Хугацаа','танин мэдэхүй','Цаг тооны бичиг') ";
        asuultuud[51]="INSERT INTO asuultuud VALUES('52','Хүн амьтны дүрстэй хүүхдийн тоглоомын ерөнхий нэр?','Мануухай','Хүнлдэй','Хүн','Хүүхэлдэй','танин мэдэхүй','Хүүхэлдэй') ";
        asuultuud[52]="INSERT INTO asuultuud VALUES('53','Маш нарийн зөөлөн ноос?','Ноос','Сур','Луур','Ноолуур','танин мэдэхүй','Ноолуур') ";
        asuultuud[53]="INSERT INTO asuultuud VALUES('54','0 цагийн бүс аль хотыг дайран гардаг вэ?','NY','Zimbabwe','Rome','London','танин мэдэхүй','London') ";
        asuultuud[54]="INSERT INTO asuultuud VALUES('55','Шатарт хүний хэдэн дүрс байдаг вэ?','1','2','3','4','танин мэдэхүй','3') ";
        asuultuud[55]="INSERT INTO asuultuud VALUES('56','МНТ-д гардаг улсын гоо ван?','Гоо Ван','Улс','Мухулай','Зэлэм','танин мэдэхүй','Мухулай') ";
        asuultuud[56]="INSERT INTO asuultuud VALUES('57','Шавьжны нэртэй орд? ','Хилэнц','Хонь','Охин','Матар','танин мэдэхүй','Хилэнц') ";
        asuultuud[57]="INSERT INTO asuultuud VALUES('58','Дэлхийн хамгийн жижиг хот улс ?','Ватикан','Венець','Бостни-Герцоговен','Черногор','танин мэдэхүй','Ватикан') ";
        asuultuud[58]="INSERT INTO asuultuud VALUES('59','МНТ-д гардаг Торголжин баяны гэргий?','Монголжингуа','Торголжингуа','Гуа марал','Үзэсгэлэн гуа','танин мэдэхүй','Монголжингуа') ";
        asuultuud[59]="INSERT INTO asuultuud VALUES('60','Ван ханы хөвгүүний нэр?','Сэнгүүр','Сэнгүм','Боргио','Хүрхрээ','танин мэдэхүй','Сэнгүм') ";

        for(int i=0;i<60;i++)
        {
            db.execSQL(asuultuud[i]);
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            String sql = "DROP TABLE IF EXISTS asuultuud";
            db.execSQL(sql);
            onCreate(db);
    }

    public boolean ins()
    {
        ContentValues values=new ContentValues();
        values.put("asuult","Mongol usliin niislel");
        values.put("h1","UB");
        values.put("h2","Darkhan");
        values.put("h3","Erdenet");
        values.put("h4","Mongol");
        values.put("torol","gazar");
        values.put("zov","UB");
        SQLiteDatabase db=getWritableDatabase();
        boolean succesful=db.insert("asuultuud",null,values)>0;
        db.close();
        return succesful;
    }

    public List<String[]> read(String sedev)
    {
        List<String[]> record = new ArrayList<String[]>();
        String sql = "SELECT * FROM asuultuud WHERE torol='"+sedev+"' ORDER BY RANDOM() LIMIT 10";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
                String asuult = cursor.getString(cursor.getColumnIndex("asuult"));
                String h1 = cursor.getString(cursor.getColumnIndex("h1"));
                String h2 = cursor.getString(cursor.getColumnIndex("h2"));
                String h3 = cursor.getString(cursor.getColumnIndex("h3"));
                String h4 = cursor.getString(cursor.getColumnIndex("h4"));
                String torol = cursor.getString(cursor.getColumnIndex("torol"));
                String zov = cursor.getString(cursor.getColumnIndex("zov"));
                String[] records=new String[8];
                records[0]=(Integer.toString(id));
                records[1]=(asuult);
                records[2]=(h1);
                records[3]=(h2);
                records[4]=(h3);
                records[5]=(h4);
                records[6]=(torol);
                records[7]=(zov);
                record.add(records);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return record;
    }

    public void deleter()
    {
        String sql="DELETE FROM asuultuud";
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL(sql);
        db.close();
    }
}
