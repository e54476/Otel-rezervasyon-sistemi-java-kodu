private String ad;
	private String soyad;
	private String tckn;
	private int odaNo;
	private int fiyat;
	private boolean[] odalar;
	private String odaTipi;
	private String telefonNo;
	private String cinsiyet;
	private String email;
	
	public Otel(String ad, String soyad, String tckn, int odaNo, int fiyat) {
		this.ad= ad;
		this.soyad= soyad;
		this.tckn= tckn;
		this.odaNo = odaNo;
		this.fiyat = fiyat;
		this.odalar = odalar;
		this.odaTipi = odaTipi;
		this.email = email;
		this.cinsiyet= cinsiyet;
		this.telefonNo= telefonNo;
	}
	 
	    public Otel() {
	        odalar = new boolean[36];
	        odalar[3] = true;   
	        odalar[6] = true;  
	        odalar[11] = true; 
	        odalar[15] = true;  
	        odalar[20] = true; 
	    }
	    public void odaSecimi(int numara) {
			if (numara >=1 && numara <= 30) {
				this.odaTipi = "Ekonomik";
				this.fiyat = 1000;
			}else if ( numara>=31 && numara <=36) {
				this.odaTipi = "Premium";
				this.fiyat= 4000;
				}
			}
	    public void odalariGoster() {
	    	
	    System.out.println("-------------------------------------------------------------");

	     for (int i = 0; i < odalar.length; i++) {

	    System.out.printf("| %2d:%-4s ", (i+1 ), odalar[i] ? "Dolu" : "Boş");

	    if ((i + 1) % 6 == 0) {
	    	  System.out.println("|");
	    System.out.println("--------------------------------------------------------------");
	    	        }
	    	    }
	    	}
	public String getAd() {
		return ad;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
		 if(telefonNo.length() == 11) {
		        this.telefonNo = telefonNo;
		    } else {
		        System.out.println("Telefon numarası hatalı!");
		        System.exit(0);
		    }
	}
	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		 if(email.contains("@")) {
		        this.email = email;
		    } else {
		        System.out.println("Email hatalı!");
		        System.exit(0);
		    }
	}
	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
		if(tckn.length()==11) {
		}else {
			System.out.println("TC'nizi Hatalı Girdiniz. Lütfen Tekrar Deneyiniz...");
			System.exit(0);
			
		}
	}
	public int getOdaNo() {
		return odaNo;
	}

	public void setOdaNo(int odaNo) {
		this.odaNo = odaNo;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public String getOdaTipi() {
		return odaTipi;
	}

	public void setOdaTipi(String odaTipi) {
		this.odaTipi = odaTipi;
	}

	public boolean[] getOdalar() {
		return odalar;
	}

	public void setOdalar(boolean[] odalar) {
		this.odalar = odalar;
	}
}
