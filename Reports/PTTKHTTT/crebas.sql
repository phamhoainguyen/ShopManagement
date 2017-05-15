/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     5/11/2017 2:40:08 PM                         */
/*==============================================================*/


drop table if exists CHITIETCONGNONHACUNGCAP;

drop table if exists CHITIETHOADONBANHANG;

drop table if exists CHITIETNHANVIEN;

drop table if exists CHITIETNOCUAKHACHHANG;

drop table if exists CHITIETPHIEUNHAPNHANG;

drop table if exists CHITIETPHIEUTRAHANG;

drop table if exists CHITIETPHIEUTRAHANGNHAP;

drop table if exists CONGNOCUAKHACHHANG;

drop table if exists CONGNONHACUNGCAP;

drop table if exists HANGHOA;

drop table if exists HOADONBANHANG;

drop table if exists KHACHHANG;

drop table if exists LOAIKHACHHANG;

drop table if exists NHACUNGCAP;

drop table if exists NHANVIEN;

drop table if exists PHIEUNHAPHANG;

drop table if exists PHIEUTRAHANG;

drop table if exists PHIEUTRAHANGNHAP;

/*==============================================================*/
/* Table: CHITIETCONGNONHACUNGCAP                               */
/*==============================================================*/
create table CHITIETCONGNONHACUNGCAP
(
   MACONGNONHACUNGCAP   char(10) not null,
   MAPHIEUNHAP          char(10) not null,
   TONGNO               float(8,2),
   primary key (MACONGNONHACUNGCAP, MAPHIEUNHAP)
);

/*==============================================================*/
/* Table: CHITIETHOADONBANHANG                                  */
/*==============================================================*/
create table CHITIETHOADONBANHANG
(
   MAHOADONBANHANG      char(10) not null,
   MAHANGHOA            char(10) not null,
   SOLUONG              smallint,
   primary key (MAHOADONBANHANG, MAHANGHOA)
);

/*==============================================================*/
/* Table: CHITIETNHANVIEN                                       */
/*==============================================================*/
create table CHITIETNHANVIEN
(
   MACHITIETNHANVIEN    char(10) not null,
   MANHANVIEN           char(10),
   SONGAYLAM            smallint,
   SOGIOLAMTRONGNGAY    smallint,
   TONGSOGIOLAM         smallint,
   TIENLUONG            float(8,2),
   TIENTHUONG           float(8,2),
   TONGLUONG            float(8,2),
   GHICHU               char(200),
   NGAYVAOLAM           datetime,
   primary key (MACHITIETNHANVIEN)
);

/*==============================================================*/
/* Table: CHITIETNOCUAKHACHHANG                                 */
/*==============================================================*/
create table CHITIETNOCUAKHACHHANG
(
   MACONGNOCUAKHACHHANG char(10) not null,
   MAHOADONBANHANG      char(10) not null,
   TIENNO               float(8,2),
   primary key (MACONGNOCUAKHACHHANG, MAHOADONBANHANG)
);

/*==============================================================*/
/* Table: CHITIETPHIEUNHAPNHANG                                 */
/*==============================================================*/
create table CHITIETPHIEUNHAPNHANG
(
   MAHANGHOA            char(10) not null,
   MAPHIEUNHAP          char(10) not null,
   SOLUONG              smallint,
   primary key (MAHANGHOA, MAPHIEUNHAP)
);

/*==============================================================*/
/* Table: CHITIETPHIEUTRAHANG                                   */
/*==============================================================*/
create table CHITIETPHIEUTRAHANG
(
   MAHANGHOA            char(10) not null,
   MAPHIEUTRAHANG       char(10) not null,
   SOLUONG              smallint,
   primary key (MAHANGHOA, MAPHIEUTRAHANG)
);

/*==============================================================*/
/* Table: CHITIETPHIEUTRAHANGNHAP                               */
/*==============================================================*/
create table CHITIETPHIEUTRAHANGNHAP
(
   MAHANGHOA            char(10) not null,
   MAPHIEUTRAHANGNHAP   char(10) not null,
   SOLUONG              smallint,
   primary key (MAHANGHOA, MAPHIEUTRAHANGNHAP)
);

/*==============================================================*/
/* Table: CONGNOCUAKHACHHANG                                    */
/*==============================================================*/
create table CONGNOCUAKHACHHANG
(
   MACONGNOCUAKHACHHANG char(10) not null,
   TONGNO               float(8,2),
   NOCANTRA             float(8,2),
   GHICHU               char(200),
   primary key (MACONGNOCUAKHACHHANG)
);

/*==============================================================*/
/* Table: CONGNONHACUNGCAP                                      */
/*==============================================================*/
create table CONGNONHACUNGCAP
(
   MACONGNONHACUNGCAP   char(10) not null,
   TONGNO               float(8,2),
   NOCANTRA             float(8,2),
   GHICHU               char(200),
   primary key (MACONGNONHACUNGCAP)
);

/*==============================================================*/
/* Table: HANGHOA                                               */
/*==============================================================*/
create table HANGHOA
(
   MAHANGHOA            char(10) not null,
   TENHANGHOA           char(50),
   GIABAN               float(8,2),
   GIAVON               float(8,2),
   TONKHO               smallint,
   NHOMHANGHOA          char(30),
   DINHMUCTONITNHAT     smallint,
   DINHMUCTONNHIEUNHAT  smallint,
   primary key (MAHANGHOA)
);

/*==============================================================*/
/* Table: HOADONBANHANG                                         */
/*==============================================================*/
create table HOADONBANHANG
(
   MAHOADONBANHANG      char(10) not null,
   MANHANVIEN           char(10) not null,
   MAKHACHHANG          char(10) not null,
   GIAGIAM              float(8,2),
   KHACHDATRA           float(8,2),
   CONNO                float(8,2),
   GHICHU               char(200),
   THOIGIAN             datetime,
   primary key (MAHOADONBANHANG)
);

/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
create table KHACHHANG
(
   MAKHACHHANG          char(10) not null,
   MALOAIKHACHHANG      char(10) not null,
   MACONGNOCUAKHACHHANG char(10),
   TENKHACHHANG         char(50),
   DIENTHOAI            char(20),
   NGAYSINH             date,
   GIOITINH             char(10),
   primary key (MAKHACHHANG)
);

/*==============================================================*/
/* Table: LOAIKHACHHANG                                         */
/*==============================================================*/
create table LOAIKHACHHANG
(
   MALOAIKHACHHANG      char(10) not null,
   LOAIKHACHHANG        char(30),
   primary key (MALOAIKHACHHANG)
);

/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
create table NHACUNGCAP
(
   MANHACUNGCAP         char(10) not null,
   MACONGNONHACUNGCAP   char(10),
   TENNHACUNGCAP        char(50),
   NHOMNHACUNGCAP       char(30),
   DIACHI               char(100),
   EMAIL                char(30),
   TONGMUA              float(8,2),
   GHICHU               char(200),
   primary key (MANHACUNGCAP)
);

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN
(
   MANHANVIEN           char(10) not null,
   TENNHANVIEN          char(50),
   SODIENTHOAI          char(20),
   NGAYSINH             date,
   DIACHI               char(100),
   GHICHU               char(200),
   primary key (MANHANVIEN)
);

/*==============================================================*/
/* Table: PHIEUNHAPHANG                                         */
/*==============================================================*/
create table PHIEUNHAPHANG
(
   MAPHIEUNHAP          char(10) not null,
   MANHACUNGCAP         char(10) not null,
   TONGTIEN             float(8,2),
   GIAGIAM              float(8,2),
   TIENDATRA            float(8,2),
   CONNO                float(8,2),
   THOIGIAN             datetime,
   GHICHU               char(200),
   primary key (MAPHIEUNHAP)
);

/*==============================================================*/
/* Table: PHIEUTRAHANG                                          */
/*==============================================================*/
create table PHIEUTRAHANG
(
   MAPHIEUTRAHANG       char(10) not null,
   MAKHACHHANG          char(10) not null,
   TONGGIA              float(8,2),
   TONGGIANHAPLAI       float(8,2),
   TIENHOANLAI          float(8,2),
   THOIGIAN             datetime,
   GHICHU               char(200),
   primary key (MAPHIEUTRAHANG)
);

/*==============================================================*/
/* Table: PHIEUTRAHANGNHAP                                      */
/*==============================================================*/
create table PHIEUTRAHANGNHAP
(
   MAPHIEUTRAHANGNHAP   char(10) not null,
   MANHACUNGCAP         char(10) not null,
   TIENNHACUNGCAPDATRA  float(8,2),
   THOIGIAN             datetime,
   TRANGTHAI            char(30),
   GHICHU               char(200),
   primary key (MAPHIEUTRAHANGNHAP)
);

alter table CHITIETCONGNONHACUNGCAP add constraint FK_CHITIETCONGNONHACUNGCAP foreign key (MACONGNONHACUNGCAP)
      references CONGNONHACUNGCAP (MACONGNONHACUNGCAP) on delete restrict on update restrict;

alter table CHITIETCONGNONHACUNGCAP add constraint FK_CHITIETCONGNONHACUNGCAP2 foreign key (MAPHIEUNHAP)
      references PHIEUNHAPHANG (MAPHIEUNHAP) on delete restrict on update restrict;

alter table CHITIETHOADONBANHANG add constraint FK_CHITIETHOADONBANHANG foreign key (MAHOADONBANHANG)
      references HOADONBANHANG (MAHOADONBANHANG) on delete restrict on update restrict;

alter table CHITIETHOADONBANHANG add constraint FK_CHITIETHOADONBANHANG2 foreign key (MAHANGHOA)
      references HANGHOA (MAHANGHOA) on delete restrict on update restrict;

alter table CHITIETNHANVIEN add constraint FK_COCHITIET foreign key (MANHANVIEN)
      references NHANVIEN (MANHANVIEN) on delete restrict on update restrict;

alter table CHITIETNOCUAKHACHHANG add constraint FK_CHITIETNOCUAKHACHHANG foreign key (MACONGNOCUAKHACHHANG)
      references CONGNOCUAKHACHHANG (MACONGNOCUAKHACHHANG) on delete restrict on update restrict;

alter table CHITIETNOCUAKHACHHANG add constraint FK_CHITIETNOCUAKHACHHANG2 foreign key (MAHOADONBANHANG)
      references HOADONBANHANG (MAHOADONBANHANG) on delete restrict on update restrict;

alter table CHITIETPHIEUNHAPNHANG add constraint FK_CHITIETPHIEUNHAPNHANG foreign key (MAHANGHOA)
      references HANGHOA (MAHANGHOA) on delete restrict on update restrict;

alter table CHITIETPHIEUNHAPNHANG add constraint FK_CHITIETPHIEUNHAPNHANG2 foreign key (MAPHIEUNHAP)
      references PHIEUNHAPHANG (MAPHIEUNHAP) on delete restrict on update restrict;

alter table CHITIETPHIEUTRAHANG add constraint FK_CHITIETPHIEUTRAHANG foreign key (MAHANGHOA)
      references HANGHOA (MAHANGHOA) on delete restrict on update restrict;

alter table CHITIETPHIEUTRAHANG add constraint FK_CHITIETPHIEUTRAHANG2 foreign key (MAPHIEUTRAHANG)
      references PHIEUTRAHANG (MAPHIEUTRAHANG) on delete restrict on update restrict;

alter table CHITIETPHIEUTRAHANGNHAP add constraint FK_CHITIETPHIEUTRAHANGNHAP foreign key (MAHANGHOA)
      references HANGHOA (MAHANGHOA) on delete restrict on update restrict;

alter table CHITIETPHIEUTRAHANGNHAP add constraint FK_CHITIETPHIEUTRAHANGNHAP2 foreign key (MAPHIEUTRAHANGNHAP)
      references PHIEUTRAHANGNHAP (MAPHIEUTRAHANGNHAP) on delete restrict on update restrict;

alter table HOADONBANHANG add constraint FK_LAPHOADON foreign key (MANHANVIEN)
      references NHANVIEN (MANHANVIEN) on delete restrict on update restrict;

alter table HOADONBANHANG add constraint FK_RELATIONSHIP_2 foreign key (MAKHACHHANG)
      references KHACHHANG (MAKHACHHANG) on delete restrict on update restrict;

alter table KHACHHANG add constraint FK_NO foreign key (MACONGNOCUAKHACHHANG)
      references CONGNOCUAKHACHHANG (MACONGNOCUAKHACHHANG) on delete restrict on update restrict;

alter table KHACHHANG add constraint FK_THUOC foreign key (MALOAIKHACHHANG)
      references LOAIKHACHHANG (MALOAIKHACHHANG) on delete restrict on update restrict;

alter table NHACUNGCAP add constraint FK_COCONGNO foreign key (MACONGNONHACUNGCAP)
      references CONGNONHACUNGCAP (MACONGNONHACUNGCAP) on delete restrict on update restrict;

alter table PHIEUNHAPHANG add constraint FK_CUNGCAPHANG foreign key (MANHACUNGCAP)
      references NHACUNGCAP (MANHACUNGCAP) on delete restrict on update restrict;

alter table PHIEUTRAHANG add constraint FK_TRAHANG foreign key (MAKHACHHANG)
      references KHACHHANG (MAKHACHHANG) on delete restrict on update restrict;

alter table PHIEUTRAHANGNHAP add constraint FK_CO foreign key (MANHACUNGCAP)
      references NHACUNGCAP (MANHACUNGCAP) on delete restrict on update restrict;

