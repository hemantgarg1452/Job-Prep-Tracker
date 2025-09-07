# 💼 Job Preparation Tracker

A **microservices-based platform** to streamline your entire job preparation workflow — from DSA practice to job applications and resume tracking. No more messy spreadsheets. Built to be **scalable, fast**, and genuinely useful.

<p align="center">
  <img src="https://img.shields.io/badge/Built%20With-Java%20%7C%20Spring%20Boot%20%7C%20MySQL%20%7C%20JPA-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/REST%20API-Microservices-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Postman-Tested-orange?style=for-the-badge" />
</p>

---

## 🚀 Why I Built This

As an aspiring backend developer, I found myself juggling between DSA prep, job applications, and resume updates — often in cluttered Google Sheets.  
So, I built a **real-world, modular, and automated job-prep system** to replace all that mess.

---

## 🧠 Core Features

### 📌 DSA Tracker
- Spaced Repetition Logic (3-5-9 rule) for smart revision
- Add problems with tags, difficulty & revisit timers
- Auto-reminders for pending revisions

### 💼 Job Tracker
- Add job links, auto-parse JD using **JSoup**
- Pre-fills fields intelligently (company, role, location)
- Track applied, rejected, interviews, etc.

### 📄 Resume Tracker
- Resume versioning & tagging  
- _(Upcoming)_ Resume scoring and feedback system using AI

---

## 🔧 Architecture Overview
<img width="433" height="406" alt="Screenshot 2025-09-07 135206" src="https://github.com/user-attachments/assets/4ef0d76d-8e13-489b-9196-ce1b85b2c95c" />




### ✅ Design Highlights

- **Microservices**: DSA, Job, Resume – isolated and independently deployable  
- **Layered Architecture**: DTOs, Services, Repositories  
- **Performance Optimized**: Avg. API response <180ms  
- **Future-Proof**: Plug-and-play modules, scalable DB relations  
- **60–70% automation** via smart workflows

---

## 📈 Roadmap

- ✅ Core APIs for DSA, Jobs, Resumes  
- ✅ Smart JD parsing & reminder system  
- 🔄 React Frontend Dashboard (In Progress)  
- 🔜 Resume Parser + AI PDF Scorer  
- 🔜 Email/Slack Notifications for reminders  

---

> ⚠️ To maintain originality and avoid code misuse, some core parts of the business logic have been intentionally excluded from this public version.  
> 🙏 I genuinely appreciate your understanding - if you're a recruiter or collaborator interested in the full implementation, I'm happy to share or walk you through it. Just drop a message!



---

## 🛠️ How to Run Locally

### 1. Clone the repo:
```bash
git clone https://github.com/hemantgarg1452/Job-Prep-Tracker.git
cd Job-Prep-Tracker
