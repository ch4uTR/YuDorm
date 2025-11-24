🏠 YUDorm

Smart Dorm Management & Issue Reporting App

YUDorm is a native Android application designed to improve daily life for university dorm residents by digitizing issue reporting, prioritization, and laundry room reservations.

📌 Purpose

To eliminate the need for residents to physically visit the lobby, reduce miscommunication, and streamline common dorm operations such as water dispenser status checks, maintenance reports, and laundry scheduling.

🎯 Core Features
🧰 1. Issue Reporting

Report water dispenser status (Empty / Low)

Report general maintenance issues (furniture, electricity, etc.)

Add a text description

Future: Attach photos to reports

📢 2. Community Dashboard

Real-time feed of all active issues

Upvote system to increase urgency/visibility

Live updates via Firestore Snapshots

🧺 3. Laundry Reservation System

View real-time availability of washing machines

Book time slots without physical waiting

Server-side double-booking prevention

“My Bookings” tab

Future: Notification when slot is about to end

🤝 4. Social Aid (Future Scope)

Request small items (painkillers, charger, etc.) from neighbors

Community-driven micro-support

✅ MVP Success Criteria

Users can submit a water/maintenance issue.

Users can view and reserve a laundry machine slot.

Upvotes update instantly and increase issue priority.

Digital reservation system reduces physical waiting and conflicts.

🏗️ Architecture & Technologies
🎨 Architecture Pattern: MVVM

Chosen for clean separation of concerns, scalability, and Jetpack Compose compatibility.

🧱 Tech Stack

Language: Kotlin

UI: Jetpack Compose

Minimum SDK: API 24
