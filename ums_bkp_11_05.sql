PGDMP     *                    {            ums    15.1    15.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16426    ums    DATABASE     z   CREATE DATABASE ums WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE ums;
                postgres    false            �            1259    16427    students    TABLE     �   CREATE TABLE public.students (
    ra character varying NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    university character varying NOT NULL,
    semester integer DEFAULT 1 NOT NULL
);
    DROP TABLE public.students;
       public         heap    postgres    false            �            1259    16433    subjects    TABLE     �   CREATE TABLE public.subjects (
    id integer NOT NULL,
    name character varying NOT NULL,
    university character varying NOT NULL,
    student character varying,
    semester integer,
    grade numeric
);
    DROP TABLE public.subjects;
       public         heap    postgres    false            �            1259    16438    subjects_id_seq    SEQUENCE     �   CREATE SEQUENCE public.subjects_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.subjects_id_seq;
       public          postgres    false    215                       0    0    subjects_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.subjects_id_seq OWNED BY public.subjects.id;
          public          postgres    false    216            �            1259    16439    universities    TABLE     J   CREATE TABLE public.universities (
    name character varying NOT NULL
);
     DROP TABLE public.universities;
       public         heap    postgres    false            �            1259    16444    users    TABLE     �   CREATE TABLE public.users (
    username character varying NOT NULL,
    password character varying NOT NULL,
    type character varying NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            r           2604    16449    subjects id    DEFAULT     j   ALTER TABLE ONLY public.subjects ALTER COLUMN id SET DEFAULT nextval('public.subjects_id_seq'::regclass);
 :   ALTER TABLE public.subjects ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    215                      0    16427    students 
   TABLE DATA           S   COPY public.students (ra, first_name, last_name, university, semester) FROM stdin;
    public          postgres    false    214   �                 0    16433    subjects 
   TABLE DATA           R   COPY public.subjects (id, name, university, student, semester, grade) FROM stdin;
    public          postgres    false    215                    0    16439    universities 
   TABLE DATA           ,   COPY public.universities (name) FROM stdin;
    public          postgres    false    217   O                 0    16444    users 
   TABLE DATA           9   COPY public.users (username, password, type) FROM stdin;
    public          postgres    false    218   t                  0    0    subjects_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.subjects_id_seq', 11, true);
          public          postgres    false    216            t           2606    16451    students students_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.students
    ADD CONSTRAINT students_pkey PRIMARY KEY (ra);
 @   ALTER TABLE ONLY public.students DROP CONSTRAINT students_pkey;
       public            postgres    false    214            v           2606    16453    subjects subjects_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.subjects
    ADD CONSTRAINT subjects_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.subjects DROP CONSTRAINT subjects_pkey;
       public            postgres    false    215            x           2606    16455    universities universities_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.universities
    ADD CONSTRAINT universities_pkey PRIMARY KEY (name);
 H   ALTER TABLE ONLY public.universities DROP CONSTRAINT universities_pkey;
       public            postgres    false    217            z           2606    16457    users users_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (username);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    218            |           2606    16458    subjects student    FK CONSTRAINT     r   ALTER TABLE ONLY public.subjects
    ADD CONSTRAINT student FOREIGN KEY (student) REFERENCES public.students(ra);
 :   ALTER TABLE ONLY public.subjects DROP CONSTRAINT student;
       public          postgres    false    215    3188    214            }           2606    16463    subjects university    FK CONSTRAINT     ~   ALTER TABLE ONLY public.subjects
    ADD CONSTRAINT university FOREIGN KEY (university) REFERENCES public.universities(name);
 =   ALTER TABLE ONLY public.subjects DROP CONSTRAINT university;
       public          postgres    false    217    215    3192            {           2606    16468    students university    FK CONSTRAINT     �   ALTER TABLE ONLY public.students
    ADD CONSTRAINT university FOREIGN KEY (university) REFERENCES public.universities(name) NOT VALID;
 =   ALTER TABLE ONLY public.students DROP CONSTRAINT university;
       public          postgres    false    217    3192    214               G   x�3444������t�O�LK��4�2426�I-.���K�,-. ����,,�t�8�R��*�L�b���� ��         -   x�34�tv041�LK��44�342ֳ�0�5�4������� ��            x�KK��*-.������ �I         <   x�3444�4426�,.)MI�+�JK̈́��e��g�Tr���,,�t�PU��qqq ��     